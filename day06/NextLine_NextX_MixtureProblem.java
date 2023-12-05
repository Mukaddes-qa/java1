package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = blabla.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("What is your age ? ");
        int age = blabla.nextInt();
        // String age = blabla.nextInt();
        //notice we are not storing this inti variable
        // we just want below line to capture ENTER keyboard input
        //so that it does not accidentally get captured by
        //the nextLine we use the capture address
        blabla.nextLine();
        System.out.println("Your age is " + age);


        System.out.println("What is the address ");
        String address = blabla.nextLine();
        System.out.println("Your address is " + address);

    }
}
