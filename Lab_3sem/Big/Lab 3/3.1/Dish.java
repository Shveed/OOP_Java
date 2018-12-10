package com.company;

public abstract class Dish {
    private String name, color;

    public String getName(){ return name; }
    public String getColor(){ return color; }

    public Dish(String Name, String Color){
        this.name = Name;
        this.color = Color;
    }

    public void Show_Info(){
        System.out.println("This is " + name);
        System.out.println(name + " is " + color);
    }
}
