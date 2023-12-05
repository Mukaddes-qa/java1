package day10;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        char operator='+';
        int num1, num2;
        System.out.println("Enter first number: ");
        num1= scan.nextInt();
        num2=scan.nextInt() ;
        System.out.println("Enter a operator( +, -, *, /");
        System.out.println("Enter second number:");

        double output;

        switch (operator){
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.println("You have entered wrong operator");
                return;
        }

        System.out.println(num1 + operator + num2 + ":" + output);

    }
}
