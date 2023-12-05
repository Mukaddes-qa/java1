package day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age:");
        int age = scan.nextInt();


        if (age >= 18) {
            System.out.println("You are ready to vote!!!");
        } else if (age < 18) {
            System.out.println("Wait until you are 18!");
        }

    }
}
