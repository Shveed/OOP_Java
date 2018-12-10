package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color;
        int weight, number;
        System.out.println("Enter information about your ball");
        System.out.println("Color");
        color = sc.nextLine();
        System.out.println("Weight");
        weight = sc.nextInt();
        System.out.println("Number");
        number = sc.nextInt();
        Ball b = new Ball(color, weight, number);
        b.showInfo();
    }
}
