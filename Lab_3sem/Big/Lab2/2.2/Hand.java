package com.company;

public class Hand {
    private int length;

    public Hand(int Length){
        length = Length;
    }
    public void Shake(){
        System.out.println("I'm shaking your " + length + " cm hand");
    }
}
