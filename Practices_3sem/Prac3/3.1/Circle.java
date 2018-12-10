package com.company;

import java.math.*;

public class Circle extends Shape {
    protected double radius;

    public Circle(){
        this.filled = false;
        this.color = "blue";
        radius = 1.0;
    }
    public Circle(double radius){
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: " + this.color;
    }
}