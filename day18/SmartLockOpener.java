package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK !!");
        System.out.println("WHAT IS THE PASSWORD: ");
        String password =scan.nextLine();
        while(!password.equals("B15")){ //while (!password.equalsIgnoreCase("B15");
            System.out.println("WRONG PASSWORD !! TRY AGAIN!!");
            password=scan.nextLine();
        }
        System.out.println("OPEN SESEAME !!!");
    }
}
