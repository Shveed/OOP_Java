package com.company;

public class Student {
    private String name;
    private int age;
    private String group;


    public Student(String Name, int Age, String Group){
        this.name = Name;
        this.age = Age;
        this.group = Group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public void show_info(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(group);
        System.out.println("/////////////");
    }
}
