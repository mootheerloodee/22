package org.example;


public class Circle {
    private int radius;

    public Circle(int _radius) {
        radius = _radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getSquare() {
        return Math.PI * radius * radius;
    }
}