package day16;

import java.util.Scanner;

public class SecondWordGetter {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Given a sentence with 3 words: ");
        String sentence = scan.nextLine();
        String secondWord;
         int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " +firstSpaceIndex );

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring(1+1,6));
        secondWord = sentence.substring(firstSpaceIndex+1, lastSpaceIndex);
        System.out.println("secondWord = " + secondWord);

        //How to get first word
        //in plain english : first word is stating from first character till first space

        String firstWord = secondWord.substring(0, firstSpaceIndex);
        // how do we print out a variable with value using shortcut : soutv then tab
        System.out.println("firstWord = " + firstWord);
        String lastWord = sentence.substring(lastSpaceIndex + 1);
        System.out.println("lastWord = " + lastWord);
    }
}
