package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Person_Name;
        int Person_Age;
        int Length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        Person_Name = sc.nextLine();
        System.out.println("Enter your age");
        Person_Age = sc.nextInt();
        Human p1 = new Human(Person_Name, Person_Age);
        p1.Greeting();
        System.out.println("What part of body are you interested in?");
        System.out.println("1 - Hand");
        System.out.println("2 - Foot");
        System.out.println("3 - Head");
        System.out.println("0 - Quit");
        int part = sc.nextInt();
        while(part != 0) {
            switch (part) {
                case 1:
                    System.out.println("Enter your hand's length(in cm)");
                    Length = sc.nextInt();
                    Hand h1 = new Hand(Length);
                    h1.Shake();
                    break;
                case 2:
                    System.out.println("Enter your foot's length(in cm)");
                    Length = sc.nextInt();
                    Foot f1 = new Foot(Length);
                    f1.Kick();
                    break;
                case 3:
                    System.out.println("Enter your foot's length(in cm)");
                    Length = sc.nextInt();
                    Head head = new Head(Length);
                    head.Shake();
                    break;
                default:
            }
            System.out.println("Keep going! Enter another number!");
            part = sc.nextInt();
        }
    }
}
