package day10;

public class Calculator {
    public static void main(String[] args) {
        char operator = '+';
        switch ((operator)){
            case '+':
                System.out.println("You are about to add numbers");
                break;
            case '-':
                System.out.println("You are about to subtract numbers");
                break;
            case '*':
                System.out.println("You are about to multiply numbers");
                break;
            case '/':
                System.out.println("You are about to divide numbers");
                break;
            default:
                System.out.println("INVALID OPERATOR!");
                break;
        }
    }
}
