package day10;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myAnswer= "";
        int myNumber= scan.nextInt();

        if (myNumber%5==0){
            myAnswer="Fizz Number";
        }else{
           myAnswer= "Not a fizz number";
        }
        System.out.println("My number is " + myNumber + " It is  " + myAnswer);
    }
}
