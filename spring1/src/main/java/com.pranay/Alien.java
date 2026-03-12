package com.pranay;

public class Alien {

    // Declare the field
    private int age;
    // Default constructor
    public Alien() {
        System.out.println("object created");
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    // Some method
    public void code() {
        System.out.println("Coding");
    }
}