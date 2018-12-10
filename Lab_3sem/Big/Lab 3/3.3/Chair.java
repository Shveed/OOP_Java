package com.company;

public class Chair extends Furniture {
    private int amount;
    private String color;
    private String name = "Chair";

    public int getAmount() {
        return amount;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Chair(int Prize, String Material, int Quality, int Amount, String Color){
        super(Prize, Material, Quality);
        this.amount = Amount;
        this.color = Color;
    }


    public void show_info() {
        System.out.println("Object: " + name);
        System.out.println("Prize: " + getPrize() + "$");
        System.out.println("Material: " + getMaterial());
        System.out.println("Quality: " + getQuality() + "%");
        System.out.println("Amount: " + amount);
        System.out.println("Color: " + color);
    }
}
