package day11;

import java.util.Scanner;

public class FailingScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scan.nextInt();
        if (score<20){
            System.out.println("COME TO MY OFFICE");
        } else if (score>30 && score<40){
            System.out.println("ATTEND ADDITIONAL CLASSES");
        } else if( score>40 && score<70) {
            System.out.println("LITTLE BIT MORE STUDY WILL LET YOU PASS");
        }
    }
}
