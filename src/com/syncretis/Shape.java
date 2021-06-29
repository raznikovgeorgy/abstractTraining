package com.syncretis;

public abstract class Shape {
    String name;


    public void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double perimeter();

    public abstract double area();
}
