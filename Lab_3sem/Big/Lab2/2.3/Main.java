package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String author, book;
        int year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Here is your BookMaker.");
        System.out.println("Enter the name of Author");
        author = sc.nextLine();
        System.out.println("Enter the name of the book");
        book = sc.nextLine();
        System.out.println("What year was it written?");
        year = sc.nextInt();
        Book b1 = new Book(author, book, year);
        b1.Show_Par();
    }
}
