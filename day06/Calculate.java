package day06;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double regularPrice, salesPrice, discount;

        System.out.println("What is the regular price: ");
         regularPrice = scan.nextDouble();

        System.out.println("What is the discount rate : ");
        discount = scan.nextDouble();

        salesPrice = regularPrice - regularPrice * discount ;

        System.out.println("regular price is " + regularPrice + " , "
                + "discount is " + discount + " and your got deal for " + salesPrice + " $ ");

    }
}
