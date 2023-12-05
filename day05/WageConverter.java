package day05;

import java.util.Scanner;

public class WageConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("How much do you earn one hour : ");
        double hourlyWage = scan.nextDouble();

        double hoursInYear = 2080;

        double yearlyWage = hourlyWage * hoursInYear;

        System.out.println("Your year salary is " + yearlyWage + "$");

    }
}
