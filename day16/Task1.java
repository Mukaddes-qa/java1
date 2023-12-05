package day16;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word1: ");
        String word1 = scan.nextLine();
        String word2 = word1.charAt(3)+ "" + word1.charAt(2)+ "" + word1.charAt(1)+ ""  + word1.charAt(0);
        System.out.println(word1 + " reverse : " +word2);

        //String word = input.nextLine();
        // for(int i = (word.length()-1); i>=0; i--){
        //System.out.print(word.charAt(i));
    }
}
