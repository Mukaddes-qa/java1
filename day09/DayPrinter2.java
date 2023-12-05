package day09;

import java.util.Scanner;

public class DayPrinter2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a day: ");
       int day = scan.nextInt();
        if(day==1){
            System.out.println("Day is Monday!");
        }else if (day==2){
            System.out.println("Day is Sunday!");
        }else if (day==3){
            System.out.println("Day is Wednesday!");
        }else if (day==4){
            System.out.println("Day is Thursday!");
        }else if (day==5){
            System.out.println("Day is Friday");
        }else if (day==6){
            System.out.println("Day is Saturday!");
        }else if (day==7){
            System.out.println("Day is Sunday");
         }else{
            System.out.println("Day is UNKNOWN!!!");
        }
    }
}
