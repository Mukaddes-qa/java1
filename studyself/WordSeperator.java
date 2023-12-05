package studyself;

import java.util.Scanner;

public class WordSeperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        //code starts here
        String output = word;
        for (int i=1; i<count; i++) {
            output += separator + word;
        }
        System.out.print(output);

    }
}
