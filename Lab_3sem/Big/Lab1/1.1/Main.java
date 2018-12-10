package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int len = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива");
        if(sc.hasNextInt()) {
            len = sc.nextInt();
        }
        int[] numbers = new int[len];
        System.out.println("You entered" + ' ' + len);
        System.out.println("Now enter elements!");
        for(int i=0;i<len;i++){
            int m = sc.nextInt();
            sum += m;
            numbers[i] = m;
        }
        System.out.println(sum);
        System.out.println("New array consists of: ");
        for(int j=0;j<len;j++) {
            System.out.print(numbers[j] + " ");
        }
        }
 };
