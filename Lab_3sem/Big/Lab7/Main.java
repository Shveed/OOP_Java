package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Student> best_students = new LinkedList<>();
        Random rnd = new Random(System.currentTimeMillis());

        int amount = 5;


        best_students.add(new Student("Ivan", 19, "IKBO"));
        best_students.addLast(new Student("Denis", 19, "IKBO"));
        best_students.add(1, new Student("Anton", 20, "IWBO"));
        best_students.addFirst(new Student("Maxim", 20, "ISBO"));
        best_students.add(new Student("Ilya", 19, "IKBO"));

        for(int i=0; i<amount; i++){
            best_students.get(i).show_info();
        }
    }
}
