package day10;

import java.util.Scanner;

public class MultiBranch_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int itemNumber= scan.nextInt();
        String order ="";

        if (itemNumber==11){
            System.out.println("You have selected 11");
            order = "Burger";
        }else if (itemNumber==5) {
            System.out.println("You have selected 5");
            order = "French Fry";
        }else if (itemNumber==8){
            System.out.println("You have selected 8");
            order = "Nuggets";
        } else if (itemNumber==35){
            System.out.println("You have selected 35");
            System.out.println("YAYY !!! YUM!");
            System.out.println("ENJOY");
            order = ("Ice cream");
        }else {
            System.out.println("YOU ARE SELECTED UNKNOWN ITEM NUMBER@!!");
            order = "Unknown";
        }
        System.out.println("Your order is " + order);
    }
}
