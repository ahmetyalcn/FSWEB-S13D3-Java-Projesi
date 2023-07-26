package com.workintech.model;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Micheal", 17);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.isTeen());
        System.out.println("-----------------");
        Wall wall = new Wall(-10,15);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
        System.out.println(wall.getArea());
        wall.setHeight(20);
        System.out.println(wall.getArea());
    }


}