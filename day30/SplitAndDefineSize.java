package day30;

import java.util.Arrays;

public class SplitAndDefineSize {
    public static void main(String[] args) {
        // split method has two version :
        // first split by some separator and get whatever the count of item we get from the result

        // secon version: accept 2 external data
        // one is the seperator another is the limit of your array size

       String sentence = "I love Java Java Java";
        String [] wordArray1 =sentence.split(" ", 1);
        String [] wordArray2 =sentence.split(" ", 2);
        String [] wordArray3 =sentence.split(" ", 3);
        String [] wordArray4 =sentence.split(" ", 4);
        String [] wordArray5 =sentence.split(" ", 5);
        String [] wordArray6 =sentence.split(" ", 6);

        System.out.println("wordArray1 = " + Arrays.toString(wordArray1));
        System.out.println("wordArray2 = " + Arrays.toString(wordArray2));
        System.out.println("wordArray3 = " + Arrays.toString(wordArray3));
        System.out.println("wordArra4 = " + Arrays.toString(wordArray4));
        System.out.println("wordArray5 = " + Arrays.toString(wordArray5));
        System.out.println("wordArray6 = " + Arrays.toString(wordArray6));

      //  System.out.println("wordArray size = " +wordArray.length);
    }
}
