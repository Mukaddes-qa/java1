package day50.shape;

import day50.shape.Drawable;

public abstract class Shape implements Drawable {
    String name;
    double area;

    public Shape(String name, double area) {
        this.name = name;
    }
    public abstract void calculateArea();
}
