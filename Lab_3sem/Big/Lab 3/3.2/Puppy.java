package com.company;

public class Puppy extends Dog {
    private String color;
    private String breed;

    public Puppy(String Name, int Age, String Color, String Breed){
        super(Name, Age);
        this.color = Color;
        this.breed = Breed;
    }

    public String getBreed() { return breed; }

    public String getColor() { return color; }

    public void show_info(){
        System.out.println("Hey, this little " + getBreed() + " is howling so loudly!");
        System.out.println("It's my " + getColor() + " " + super.getName() + ". He is " + super.getAge() + " years old");
    }
}
