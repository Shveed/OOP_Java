package com.company;

public class Ball {
    private String color;
    private int weight, number;

    Ball(String Color, int Weight, int Number){
        this.color = Color;
        this.weight = Weight;
        this.number = Number;
    }

   public String toString(int i){return i +  "@" + Integer.toHexString(hashCode());}

   public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumber() {
        return number;
    }

    public void showInfo(){
        System.out.println("You have " + getColor() + " ball with number " + number + ". It weights " + weight + " pounds.");
    }
}
