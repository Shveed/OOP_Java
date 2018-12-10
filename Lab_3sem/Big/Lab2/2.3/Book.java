package com.company;

public class Book {
    String Author_Name, Book_Name;
    int year;

    public Book(String author, String book, int Year){
        Author_Name = author;
        Book_Name = book;
        year = Year;
    }

    public void Reset_Name(String name){ Author_Name = name; }
    public void Reset_Year(int Year) { year = Year ;}
    public void Show_Par(){
        System.out.println("This is the book written by " + Author_Name);
        System.out.println("It is called " + Book_Name);
        System.out.println(Book_Name + " was written in " + year);
    }
}
