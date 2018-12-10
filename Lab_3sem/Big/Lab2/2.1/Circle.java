package com.company;

public class Circle {
    private int mid_x;
    private int mid_y;
    private int radius;
    private String color;

    public Circle(int rad, int midX, int midY, String col){
        radius = rad;
        mid_x = midX;
        mid_y = midY;
        color = col;
    }
    public void Square(int rad){
        System.out.println("Square of the circle is " + (3.14 * rad * rad));
    }

    public void Loc(int rad){
        System.out.println("Length of the circle is " + (2 * 3.14 * rad));
    }
}
