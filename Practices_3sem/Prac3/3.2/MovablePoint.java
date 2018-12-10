package com.company;

public class MovablePoint {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint(int x1, int y1, int xSpeed, int ySpeed){}

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}
}
