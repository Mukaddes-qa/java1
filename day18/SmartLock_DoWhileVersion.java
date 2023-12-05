package day18;

import java.util.Scanner;

public class SmartLock_DoWhileVersion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK !!");

        String password;

        do{

            System.out.println("WHAT's the password:");
            password=scan.nextLine();
        }while (! password.equals("B15"));

        System.out.println("DOOR IS OPEN");

    }
}
