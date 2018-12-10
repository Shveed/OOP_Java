package com.company;

public class Student {
    private String name;
    private int id;

    Student(String Name, int ID){
        this.name = Name;
        this.id = ID;
    }

    public int getId() {
        return id;
    }

    public void show(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
