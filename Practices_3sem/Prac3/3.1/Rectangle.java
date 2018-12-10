package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.width = 15;
        this.length = 30;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() { return this.width; }
    public double getLength() { return this.length; }
    public void setWidth(double width) { this.width = width; }
    public void setLength(double length) { this.length = length; }

    public double getArea(){ return width * length; }
    public double getPerimeter(){ return 2 * (width + length); }
    public String toString(){ return "Shape: rectangle, width: "+this.width+", length: " + this.length + ",color: " + this.color;
    }
}
