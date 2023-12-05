package day09;

import java.util.Scanner;

public class LanguagePicker_Switch {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Welcome to Cybertek Call Center");
        System.out.println("Please select yout language option from 1-7: ");
        int number = scan.nextInt();
        String greeting="";
        switch (number){
            case 1 :
                System.out.println(greeting + "Hello");
                break;
            case 2 :
                System.out.println(greeting + "Salam");
                break;
            case 3 :
                System.out.println(greeting + "Hola");
                break;
            case 4 :
                System.out.println(greeting + "Privet");
                break;
            case 5 :
                System.out.println( greeting + "Merhaba");
                break;
            case 6 :
                System.out.println(greeting + "Szia");
                break;
            case 7 :
                System.out.println(greeting + "Bonjour");
                break;
            default:
                System.out.println("Unknown");
        }

        System.out.println(greeting + " BATCH 15 SDET!!");
    }
}
