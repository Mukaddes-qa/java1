package day09;

import java.util.Scanner;

public class LanguagePicker {
    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        System.out.println("Welcome to Cybertek Call Center");
        System.out.println("Please select yout language option from 1-7: ");
        int number = scan.nextInt();
        String greeting="";
        if (number==1){
            greeting = "Hello";
        } else if (number==2){
            greeting ="Salam";
        } else if (number==3){
            greeting ="Hola";
        } else if (number==4){
            greeting= "Privet";
        } else if (number==5){
            greeting ="Merhaba";
        } else if (number==6){
            greeting ="Szia";
        } else if (number==7) {
            greeting = "Bonjour";
        }else{
            greeting= "Unknown!";
        }
            System.out.println(greeting + " BATCH 15 SDET!!");
    }
}
