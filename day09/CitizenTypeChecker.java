package day09;

import java.util.Scanner;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        String citizenType;
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=scan.nextInt();

        if (age>65){
            citizenType = " a Senior";

        } else {
            citizenType= "not a Senior";

            System.out.println("The citizen age is " + age + " , and he is " + citizenType);
    }
}
}
