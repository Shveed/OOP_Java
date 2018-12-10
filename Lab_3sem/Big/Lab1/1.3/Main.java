package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float row = 0;
        int n;
        System.out.print("Enter length: ");
        n = sc.nextInt();
        for (double i=1;i<=n;i++){
            row += 1/i;
            System.out.println(row);
        }
        System.out.print("The harmonic row equals to " + row);
    }
};
