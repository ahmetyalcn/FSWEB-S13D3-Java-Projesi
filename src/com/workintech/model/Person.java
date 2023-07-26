package com.workintech.model;

public class Person {
    //instance variables
    String firstname;
    String lastname;
    int age;
    boolean isMarried;
    double salary;
    String[] pets;

    //constructors
    public Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public Person(String firstname, String lastname, int age, boolean isMarried, double salary, String[] pets){
        //constructor overloading
       this(firstname,lastname,age);
       this.isMarried = isMarried;
       this.salary = salary;
       this.pets = pets;
    }
    //metots
    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age>=13 && age<=19;
    }

}
