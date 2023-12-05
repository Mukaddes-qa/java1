package day31;

public class Calculator {
    public static void main(String[] args) {
        add(6, 23);
        add(16, 3);
        add(1, 6);

        add3Numbers(1,5,99);
        add3Numbers(10,5,25);
    }
    public static void add (int num1,int num2){

        System.out.println("addition result -->>> " + (num1+num2));
    }
    public static void add3Numbers(int num1, int num2, int num3){
        System.out.println("Add 3 numbers result -->>> " + (num1+num2+num3));
    }
}
