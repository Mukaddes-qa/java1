package day05;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many days what would you want to convert in to the minutes : ");
           int day = scan.nextInt();
           int  minute = day * (60*24) ;
        System.out.println(day + " days equal to " + minute + " minutes." );






    }
}
