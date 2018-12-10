package com.company;
import java.util.Scanner;

public class AuthorTest {

    public static void main(String[] args) {
        String name, email;
        char gender;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter author's data");
        System.out.println("Name:");
        name = sc.nextLine();
        System.out.println("Email");
        email = sc.nextLine();
        System.out.println("Gender");
        gender = sc.next().charAt(0);
        Author a1 = new Author(name, email, gender);
        System.out.println(a1.toString());

    }
}
