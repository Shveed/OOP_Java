package com.company;
public class Human {
    private String name;
    private int age;

    public Human(String Name, int Age){
        name = Name;
        age = Age;
    }

    public void Greeting(){
        System.out.println("Hello, dear " + name);
        System.out.println("We know, you are " + age + " years old");
    }
}
