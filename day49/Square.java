package day49;

public class Square extends Shape {

    int length;

    public Square(String name,int length) {
        super(name);
        this.length=length;
    }

    @Override
    public void calculateArea() {
        System.out.println(length*length);
    }
    @Override
    public void Draw() {
        System.out.println("draw square");
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
