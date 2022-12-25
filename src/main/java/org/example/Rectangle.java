package org.example;

import java.util.HashSet;

public class Rectangle {
    private int a;
    private int b;
    private int c;
    private int d;

    public Rectangle(int _a, int _b, int _c, int _d) {
        this.a = _a;
        this.b = _b;
        this.c = _c;
        this.d = _d;
        HashSet <Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        if (!(set.size() == 1 || set.size() == 2)) throw new RuntimeException("Невозможно");
    }

    public int getPerimeter() {
        return a + b + c + d;
    }

    public int getSquare() {
        return Math.min(a, Math.min(b, Math.min(c, d))) *
                Math.max(a, Math.max(b, Math.max(c, d)));
    }
}