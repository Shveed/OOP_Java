package com.company;

public class Table extends Furniture {
    private int length;
    private int width;
    private int height;
    private String color;
    private String name = "Table";

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public Table(int Prize, String Material, int Quality, int Length, int Width, int Height, String Color){
        super(Prize, Material, Quality);
        this.length = Length;
        this.width = Width;
        this.height = Height;
        this.color = Color;
    }

    public void show_info() {
        System.out.println("Object: " + name);
        System.out.println("Prize: " + getPrize() + "$");
        System.out.println("Material: " + getMaterial());
        System.out.println("Quality " + getQuality() + "%");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
    }
}
