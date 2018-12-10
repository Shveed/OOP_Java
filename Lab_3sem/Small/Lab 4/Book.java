package com.company;

class Book implements Printable {
    private int price;
    private String name, author;

    public  Book(int Price, String Name, String Author){
        this.price = Price;
        this.name = Name;
        this.author = Author;
    }
    public int getPrice(){
        return price;
    }
}
