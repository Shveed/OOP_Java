package com.company;

public class Plate extends Dish {
    private String type = "plate";
    private int amount;

    public Plate(String name, String color, int Amount){
        super(name, color);
        this.amount = Amount;
    }

    public void Show_Info(){
        super.Show_Info();
        System.out.println("You picked a type - " + type);
        System.out.println("There are " + amount + " of " + super.getName());
    }

}
