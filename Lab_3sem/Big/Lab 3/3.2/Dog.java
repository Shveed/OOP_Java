package com.company;

public abstract class Dog {
    private String name;
    private int age;

    public Dog(String Name, int Age){
        this.name = Name;
        this.age = Age;
    }

    public int getAge() { return age; }

    public String getName() { return name; }

    public abstract void show_info();

}
