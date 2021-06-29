package com.syncretis;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape {

    double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double area() {
        return PI * pow(radius, 2);
    }
}
