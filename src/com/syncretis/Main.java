package com.syncretis;

public class Main {

    public static void main(String[] args) {
    Shape circle = new Circle("Circle", 5);
    Shape rectangle = new Rectangle("Rectangle", 4, 5);
    Shape square = new Square("Square", 5);
    Shape triangle = new Triangle("Triangle", 5, 7, 7);
    Shape triangle2 = new Triangle("Triangle", 5, 7, 7);

    System.out.println(triangle.equals(triangle2));
    System.out.println(triangle.hashCode());
    System.out.println(triangle2.hashCode());

    circle.printName();
    rectangle.printName();
    square.printName();
    triangle.printName();

        System.out.println("First commit");
        System.out.println("Second commit");
        System.out.println("Third commit");
    }
}
