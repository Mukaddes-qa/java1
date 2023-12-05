package day49;

public class Circle extends Shape implements Drawable {
    int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(3.14*radius*radius);
    }

    @Override
    public void Draw() {
        System.out.println("Draw circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
