package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name? ");
        // nextLine method of Scanner is used to capture whole Line

        String name = blabla.nextLine();

        System.out.println("You have entered " + name);

        // task4
        // use nextLine to ask your bio
        // whats your name
        // which city you Live in, including state, Tyson, VA
        // What is your street address

    }
}
