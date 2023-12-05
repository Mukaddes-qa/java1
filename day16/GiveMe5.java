package day16;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
    //    System.out.println("Give me Five!!!");
     //   int number = scan.nextInt();
       // if(number!=5){
      //      System.out.println("Hey yo did not give me 5!!!");
        //    ++number;
        //}
        int number =0;
        while (number!=5){
            System.out.println("GIVE ME FIVE");
            number=scan.nextInt();
        }
        System.out.println("END OF THE PROGRAM!!");
    }
}
