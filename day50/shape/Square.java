package day50.shape;

import day50.shape.Shape;

public class Square extends Shape {
     int length;

    public Square(String name, double area, int length) {
        super(name, area);
        this.length=length;
    }

    @Override
    public void calculateArea() {
    area =length*length;
    }

    @Override
    public void draw() {
        System.out.println("Draw 4 egual with length " + length + "with color" + COLOR);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
