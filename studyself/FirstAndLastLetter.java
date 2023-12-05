package studyself;

import java.util.Scanner;

public class FirstAndLastLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String first = word.substring(0,1);
        String last = word.substring(word.length()-1);
        System.out.print(first+last);
        //                         first                      last
        //System.out.println("" + word.charAt(0) + word.charAt(word.length()-1));

    }
}
