package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k = 1, a, b;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        rec1(n, k);
        rec2(n, k);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        rec3(a, b);
    }

	    public static void rec1(int n, int k){
            if (k != n+1) {
                for (int i = 0; i < k; i++) {
                    System.out.print(k + " ");
                }
                rec1(n, (k + 1));
            }
            else{
                System.out.println();
            }
        }

        public static void rec2(int n, int k){
            if(k <= n){
                System.out.print(k + " ");
                rec2(n, k+1);
            }
            else{
                System.out.println();
            }
        }

    public static void rec3(int a, int b){
        if(a <= b) {
            if(a != b) {
                System.out.print(a + " ");
                rec3(a + 1, b);
            }
            else{
                System.out.print(b);
            }
        }
        if(a >= b){
            if(b != a) {
                System.out.print(a + " ");
                rec3(a - 1, b);
            }
        }
    }
}
