package com.company;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "blue";
        this.filled = false;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    void setFilled(boolean Filled){
        this.filled = Filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
