package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int prize, quality, amount, length, width, height;
        String material, color;

        Scanner sc = new Scanner(System.in);

        System.out.println("-----Chair data-----");
        System.out.println("Enter wish-prize: ");
        prize = sc.nextInt();
        System.out.println("Enter material: ");
        material = sc.next();
        System.out.println("Enter quality: ");
        quality = sc.nextInt();
        System.out.println("Enter amount:" );
        amount = sc.nextInt();
        System.out.println("Enter color:");
        color = sc.next();
        Chair c1 = new Chair(prize, material, quality, amount, color);
        c1.show_info();

        System.out.println("-----Table data-----");
        System.out.println("Enter wish-prize: ");
        prize = sc.nextInt();
        System.out.println("Enter material: ");
        material = sc.next();
        System.out.println("Enter quality: ");
        quality = sc.nextInt();
        System.out.println("Enter length");
        length = sc.nextInt();
        System.out.println("Enter width");
        width = sc.nextInt();
        System.out.println("Enter height");
        height = sc.nextInt();
        System.out.println("Enter color:");
        color = sc.next();
        Table t1 = new Table(prize, material, quality, length, width, height, color);
        t1.show_info();
    }
}
