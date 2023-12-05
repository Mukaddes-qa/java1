package day17;

public class FizzNumber {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 50) {


            if ((number % 3 == 0) && (number % 5 == 0)) {
                System.out.println(number + " is Fizz Buzz number");
            } else if (number % 5 == 0) {
                System.out.println(number + " is Fizz Number");
            } else if (number % 3 == 0) {
                System.out.println(number + " is Buzz number ");
            }
            ++number;
        }

    }
}
