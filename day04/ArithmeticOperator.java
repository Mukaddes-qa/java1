package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {

        int a = 5;
        double b = 3.0d;
        float c = 3.0f;

        double result1 = a + b;
        double result2 = a - b;
        double result3 = a * b;
        double result4 = a / b;
        float result5 = a / c;

        System.out.println("The result of (a + b): " + result1 + "\n"
                + "The result of (a - b): " + result2 + "\n"
                + "The result of (a * b) : " + result3 + "\n"
                + "The result of (a / b) : " + result4 + "\n"
                + "The result of (a / c) : " + result5);







        System.out.println(5 + 3); // 8
        System.out.println(5 - 3); // 2
        System.out.println(5 * 3); // 15
        System.out.println(5 / 3); // 1

        // arithmetic operator between two numerical data type
        System.out.println( 5 + 3.0d ); // 8
        System.out.println( 5 - 3.0d ); // 2
        System.out.println( 5 * 3.0d ); // 15
        System.out.println( 5 / 3.0d ); // 1
        System.out.println( 5 / 3.0f ); // 1

        // store above numbers in variables
        // and replace above statement with variables instead
        // dataType result1 = the calculation here
        // System.out.println(result1);



    }
}
