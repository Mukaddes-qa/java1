package day11;

import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = scan.nextInt();
        if (score<0 || score>100){
            System.out.println("INVALID SCORE!!!");
        } else if ( score==100){
            System.out.println("PERFECT SCORE");
        } else if (score>70 && score<100){
            System.out.println("YOU HAVE PASSED!");
        } else {
            System.out.println("FAILED!");
        }
    }
}
