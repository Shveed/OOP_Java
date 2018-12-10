package com.company;

public abstract class Furniture {
    private int prize;
    private String material;
    private int quality;

    public int getPrize() {
        return prize;
    }

    public String getMaterial() {
        return material;
    }

    public int getQuality() {
        return quality;
    }

    public Furniture(int Prize, String Material, int Quality){
        this.prize = Prize;
        this.material = Material;
        this.quality = Quality;
    }

    public abstract void show_info();
}
