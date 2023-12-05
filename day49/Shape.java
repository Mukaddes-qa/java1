package day49;

public abstract class Shape implements Drawable{
    String name;
    double area;

    public abstract void calculateArea();

    public Shape(String name){
        this.name=name;
    }

}
