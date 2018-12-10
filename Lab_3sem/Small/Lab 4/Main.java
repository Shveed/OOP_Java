package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  name, author;
        int price, season, option;

        System.out.println("1 - Journal, 0 - Book");
        option = sc.nextInt();
        if(option == 1){
            System.out.println("Enter name of the journal:");
            name = sc.next();
            System.out.println("Enter season number:");
            season = sc.nextInt();
            System.out.println("Enter price of the journal");
            price = sc.nextInt();
            Journal j1 = new Journal(price, season, name);
            System.out.println(name + " of the " + season + " season costs " + j1.getPrice() + " $");
        }
        else{
            System.out.println("Enter name of the book:");
            name = sc.next();
            System.out.println("Enter author's name:");
            author = sc.next();
            System.out.println("Enter price of the book");
            price = sc.nextInt();
            Book b1 = new Book(price, author, name);
            System.out.println(name + " of " + author + " costs  " + b1.getPrice() + " $");
        }
    }
}
