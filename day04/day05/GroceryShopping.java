package day05;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price for tomato: ");
        float tomatoPrice = scan.nextFloat();
        System.out.println("How much you want to buy ? ");
        int countTomato = scan.nextInt();
        float tomatoTotal = countTomato * tomatoPrice;

        System.out.println("What is the price of potato : ");
        float potatoPrice = scan.nextFloat();
        System.out.println("How much potato you want buy : ");
        int countPotato = scan.nextInt();
        float totalPotato = countPotato * potatoPrice;

        System.out.println("What is the price of banana : ");
        float bananaPrice= scan.nextFloat();
        System.out.println("How much banana you want buy :");
        int bananaCount = scan.nextInt();
        float totalBanana = bananaCount * bananaPrice;
        
        float checkPrice = tomatoTotal + totalPotato + totalBanana ;

        System.out.println("Your total Check is : " + checkPrice + " $ ");








    }
}
