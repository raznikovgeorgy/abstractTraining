package com.syncretis;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {

    float base;
    float leftSide;
    float rightSide;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(float leftSide) {
        this.leftSide = leftSide;
    }

    public float getRightSide() {
        return rightSide;
    }

    public void setRightSide(float rightSide) {
        this.rightSide = rightSide;
    }

    public Triangle(String name, float base, float leftSide, float rightSide) {
        this.name = name;
        if (base + leftSide > rightSide && base + rightSide > leftSide && leftSide + rightSide > base) {
            this.base = base;
            this.leftSide = leftSide;
            this.rightSide = rightSide;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return triangle.name.equals(name) && Double.compare(triangle.base, base) == 0 && Double.compare(triangle.leftSide, leftSide) == 0 && Double.compare(triangle.rightSide, rightSide) == 0;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 37 * result + name.hashCode();
        result = 37 * result + Float.floatToIntBits(base);
        result = 37 * result + Float.floatToIntBits(leftSide);
        result = 37 * result + Float.floatToIntBits(rightSide);

        return result;
    }

    @Override
    public double perimeter() {
        return base + leftSide + rightSide;
    }

    @Override
    public double area() {
        return sqrt((perimeter() / 2) * (perimeter() / 2 - base) * (perimeter() / 2 - leftSide) * (perimeter() / 2 - rightSide));
    }
}
