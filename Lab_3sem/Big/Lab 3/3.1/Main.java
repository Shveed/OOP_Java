package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Name, Color, Type;
        int Amount;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Dish name:");
        Name = sc.nextLine();
        System.out.println("Now enter it's color");
        Color = sc.nextLine();
        Plate p1 = new Plate(Name, Color, 5);
        p1.Show_Info();
    }
}
