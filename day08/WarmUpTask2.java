package day08;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Check my favorite number:");

        int myFavoriteNumber =scan.nextInt();

        if (myFavoriteNumber==3){
            System.out.println(" BINGOO!!!");
        }else{
            System.out.println("Try again later");
        }
    }
}
