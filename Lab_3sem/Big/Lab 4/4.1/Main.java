package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, brand;
        int option;
        int weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the brand");
        name = sc.nextLine();
        System.out.println("Enter what kind of transport is it: 1 - Car, 0 - Motorcycle ");
        option = sc.nextInt();
        if (option == 1) {
            System.out.println("How much does your car weight?");
            weight = sc.nextInt();
            System.out.println("What model is your car?");
            brand = sc.next();
            Car c1 = new Car(name, weight, brand);
            System.out.println(c1.getName() + " is successfully added!");
        } else {
            System.out.println("How much does your bike weight?");
            weight = sc.nextInt();
            System.out.println("What model is your bike?");
            brand = sc.next();
            Moto m1 = new Moto(name, weight, brand);
            System.out.println(m1.getName() + " is successfully added!");
        }
    }
}
