package day12;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one number:");
        int number= scan.nextInt();

        if(number%3==0 && number%5==0){
            System.out.println("FizzBuzz NUMBER!");
        }else if (number%5==0){
            System.out.println("FIZZ NUMBER!");
        }else if (number%3==0){
            System.out.println("BUZZ NUMBER!");
        }else{
            System.out.println("NOT MY NUMBER!");
        }
    }
}
