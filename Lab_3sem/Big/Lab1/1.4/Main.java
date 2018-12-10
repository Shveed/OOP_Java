package com.company;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter length of array: ");
        len = sc.nextInt();
        int[] mas = new int[len];
        for(int i=0;i<len;i++){
            mas[i] = (int)(Math.random() * 100);
            System.out.print(mas[i] + " ");
        }
        Arrays.sort(mas);
        System.out.println();
        System.out.println("Now it's sorted to");
        for(int j=0;j<len;j++){
            System.out.print(mas[j] + " ");
        }
    }
}
