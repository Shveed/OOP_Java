package com.company;


public class Foot {
    private int length;

    public Foot(int Length) {
        length = Length;
    }

    public void Kick(){
        System.out.println("Kicked something with " + length + " cm foot");
    }
}
