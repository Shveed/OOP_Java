package com.company;

class Journal implements Printable {
    private int price, season;
    private String name;

    public Journal(int Price, int Season, String Name){
        this.price = Price;
        this.season = Season;
        this.name = Name;
    }

    public int getPrice(){
        return price;
    }
}
