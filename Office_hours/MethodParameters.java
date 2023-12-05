package Office_hours;

import java.util.Arrays;

public class MethodParameters {
    public static void main(String[] args) {
        System.out.println("ConvertToKmToMiles : ");
        convertToKmToMiles(2);
        System.out.println("ConvertToGallonsToLitters : ");
        convertToGallonsToLitters(12);
        System.out.println("DescOrder : ");
        int[] array = {2, 3, 1, 5, 10, 18, 19, 20};
        DescOrder(array);

        System.out.println("Calculation : ");
        calculation(5,9,"+");
        calculate2(3,7,'*');
    }

    //1. write a method that can convert km to miles
    //	 				Hint: 1 km = 0.612 miles
    public static void convertToKmToMiles(double km) {
        double miles = km * 0.612;

        System.out.println(miles);
    }

    //2. write a method that can convert gallons to litters
    //	 			   Hint: 1 G = 3.75 L
    public static void convertToGallonsToLitters(double gallons) {
        double litters = 3.75 * gallons;
        System.out.println(litters);
    }

    // Task03:  write a method that can print out the int array in Descending order
    public static void DescOrder(int[] array) {
        //[2,3,1,5]
        Arrays.sort(array); //[1,2,3,5]
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    //write a method that accepts 3 parameters: 2 numbers and one operator,
    //	 	and prints out the calculation
    //		if operator is not between [-, +, *, /, %] output should be Invalid Operator
    //			Ex: calculate(10, 2, "*") ==> 20;
    //				calculate(20, 2, "~") ==> invalid operator
    public static void calculation(int a, int b, String operators){
        if (operators.equals("-")) {
            System.out.println(a - b);
        } else if (operators.equals("+"))
            System.out.println(a + b);
        else if (operators.equals("*"))
            System.out.println(a * b);
        else if (operators.equals("/"))
            System.out.println(a / b);
        else if (operators.equals("%"))
            System.out.println(a % b);
        else
            System.out.println("Invalid operator");

    }
    public static void calculate2(int a, int b, char operator) {

        switch (operator) {
            case '-':
                System.out.println(a - b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}