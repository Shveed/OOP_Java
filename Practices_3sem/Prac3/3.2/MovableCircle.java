package com.company;

public class MovableCircle {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}

}
