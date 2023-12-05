package day08;

import java.util.Scanner;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        // pseudo sudo code
        /*
        * given your currentsSpeed, speedLimit
        *
        * check whether the current speed is
        *
        * more than 90 --->> jail
        * more than 80  and less than 90 --->> reckless driving
        * more than 70 and less than 80 ---->> point taken
        * more than 60 and less than 70 ---->>warning
        *
        * if not speeding keep driving
        *
        * // 45, 65, 90 and less
         */

        int currentSpeed = 100;

        if (currentSpeed>90){
            System.out.println("You are driving more than 90 Go to jail");
        } else if ( currentSpeed>80 && currentSpeed<90){
            System.out.println("That is Reckless driving");
        }else if (currentSpeed>70 && currentSpeed<80){
            System.out.println("You should Point taken");
        }else if (currentSpeed>60 && currentSpeed<70){
            System.out.println("Warning!!!!");
        }else{
            System.out.println("KEEP DRIVING YOU ARE GOOD!!!");
        }

    }

}
