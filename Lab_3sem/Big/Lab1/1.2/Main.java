package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter something!");
        s = sc.nextLine();
        System.out.print("You entered: " + s);
    }
};
