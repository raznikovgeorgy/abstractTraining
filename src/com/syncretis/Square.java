package com.syncretis;

import static java.lang.Math.pow;

public class Square extends Shape {

    double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Square(String name, double a) {
        this.name = name;
        this.a = a;
    }

    public Square(){

    }

    @Override
    public double perimeter() {
        return 2 * a;
    }

    @Override
    public double area() {
        return pow(a, 2);
    }
}
