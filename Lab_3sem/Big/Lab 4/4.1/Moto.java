package com.company;

class Moto implements Nameable {
    private String name;
    private int weight;
    private String brand;

    public Moto(String Name, int Weight, String Brand){
        this.name = Name;
        this.weight = Weight;
        this.brand = Brand;
    }

    public String getName(){
        return name;
    }
}
