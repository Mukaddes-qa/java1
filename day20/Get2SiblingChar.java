package day20;

import java.util.Scanner;

public class Get2SiblingChar {
    public static void main(String[] args) {
        //give a String with even number character in one line
        //print 2 characters in one line
        // for example : Arya
        /* ar
           ry
           ya
         */
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for (int x = 0; x <=name.length()-2 ; x+=1) {
            System.out.println(""+name.substring(x,x+2));
        }
    }
}
