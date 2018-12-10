package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String name, color, breed;
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to DogChanger");
        System.out.println("Enter name of your dog!");
        name = sc.next();
        System.out.println("Enter your dog's age");
        age = sc.nextInt();
        System.out.println("Enter it's color");
        color  = sc.next();
        System.out.println("Enter it's breed");
        breed = sc.next();
        Dog d1 = new Puppy(name, age, color, breed);
        d1.show_info();

    }
}
