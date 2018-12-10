package com.company;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.println("Enter length");
        len = sc.nextInt();
        System.out.println(factorial(len));
    }

    static public int factorial(int len){
        int f = 1;
        for(int i=1;i<=len;i++){
            f *= i;
        }
        return f;
    }
}
