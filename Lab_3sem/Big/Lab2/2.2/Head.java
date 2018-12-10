package com.company;

import java.util.Scanner;

public class Head {
    private int iq;
    private String HairColor;

    public Head(int Length){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter person's IQ");
        iq = sc.nextInt();
        System.out.println("Enter person's hair color");
        HairColor = sc.nextLine();

    }

    public void Shake(){
        System.out.println("Your person is shaking a head");
    }
}
