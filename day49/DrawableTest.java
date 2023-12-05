package day49;

public class DrawableTest {
    public static void main(String[] args) {
        Circle c1= new Circle("yuvarlak", 6);
        c1.Draw();
        c1.calculateArea();
        c1.toString();

        Square s1= new Square("kare", 4);
        s1.Draw();
        s1.calculateArea();
        s1.toString();


    }
}
