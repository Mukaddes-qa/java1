package day06;

import java.util.Scanner;

public class CoinConverter2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of cents : ");
        int cent = scan.nextInt();
        System.out.println("Enter how much you spend : " );
        int spend = scan.nextInt();

        int total = cent - spend;
        int quarter = total / 25;
        int penny = total % 25;
        int dime = total / 10;
        int penny2 = total%10;
        int dollar = total / 100;
        int cents = total % 100;
        char dollarSign = '$';

        System.out.println("After all purchases you have coins to your in wallet; "
        + quarter + " quarter " + " and penny " + penny + " or : ");
        System.out.println("After all purchases you have coins in your wallet; "
                + dime + " dime and penny " + penny2);
        System.out.println("Total balance is : " + dollar + dollarSign + " and " + cents + " cents");
        System.out.println(" Thank you! ");



    }
}
