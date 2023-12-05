package day09;

import javax.swing.*;
import java.util.Scanner;

public class DayPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a day: ");
       /* int day = scan.nextInt();
       /* if(day==1){
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
        }*/
       int day = scan.nextInt();
       String dayName = ""; // ASSIGNING A Empty String value
        if(day==1){
           dayName="Monday";
        }else if (day==2){
            dayName="Tuesday";
        }else if (day==3){
            dayName="Wednesday";
        }else if (day==4){
            dayName="Thursday";
        }else if (day==5){
            dayName="Friday";
        }else if (day==6){
            dayName="YAAAYY IT IS A Saturday";
        }else if (day==7){
            dayName="HOLIDAY OVER BECAUSE IT IS SUNDAY";
        }else {
            dayName = "UNKNOWN!";
        }

        System.out.println("Day is : " + dayName);
    }
}
