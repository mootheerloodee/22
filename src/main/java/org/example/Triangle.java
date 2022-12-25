package org.example;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int _a, int _b, int _c) {
        a = _a;
        b = _b;
        c = _c;
        if (!(a + b > c && a + c > b && c + b > a)) throw new RuntimeException("Невозможно");
    }
    public int getPerimeter() {
        return a + b + c;
    }

    public double getSquare() {
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}