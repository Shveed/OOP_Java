package com.company;

public class Square extends Rectangle {
    protected double side;
    public Square(){
        this.side = 15;
    }
    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        super.color = color;
        super.filled = filled;
    }

    double getSide(){ return super.width; }
    void setSide(double side){ super.width = side; }
    public void setWidth(double side){ super.width = side; }
    public void setLength(double side){ super.length = side;}

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
