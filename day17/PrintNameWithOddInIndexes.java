package day17;


import java.util.Scanner;


public class PrintNameWithOddInIndexes {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("ENTER YOUR NAME:");
        String name = scan.nextLine();
        int x= 0;
        // x<=name.length()-1 meaning;
        // starting from 0 until last index

        // x<=name.length()-1 meaning;
        // starting from 0 until right before the count of characters
        while (x<name.length()){
            if ( x % 2 == 1){
                System.out.println(name.charAt(x));

            }
            ++x;
            }


        }
    }

