package day06;

import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wholeNumber ;
        System.out.println("Enter minutes as whole number : ");
         wholeNumber =scan.nextInt();
        int hour = wholeNumber / 60;
        int mins = wholeNumber % 60;

        System.out.println("The result is " + wholeNumber + ":" + hour + " hour is " + mins + " minute");
    }
}
