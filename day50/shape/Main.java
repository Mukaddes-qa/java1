package day50.shape;

public class Main {
    public static void main(String[] args) {
        Square s1= new Square(" my precious",10, 12);
        System.out.println("s1 without area calculation = " + s1);
        s1.calculateArea();
        System.out.println("s1 with are calculation = " + s1);
        s1.draw();
        System.out.println("s1 = " + s1);
    }
}
