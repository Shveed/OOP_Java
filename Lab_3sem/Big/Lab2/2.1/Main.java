package com.company;
import java.lang.System;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad, midX, midY;
        String color;
        System.out.println("Enter radius ");
        rad = sc.nextInt();
        System.out.println("Enter coordinates(X and Y)");
        midX = sc.nextInt();
        midY = sc.nextInt();
        System.out.println("Enter color of the circle");
        color = sc.nextLine();
        Circle c1 = new Circle(rad, midX, midY, color);
        c1.Square(rad);
        c1.Loc(rad);
    }
}
