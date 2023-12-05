package studyself;

import java.util.Arrays;

public class StringtoDoubleArrayMethod {
    public static void main(String[] args) {
        // create an double array of 3 items ; and put 3 value
        // get a string representation out of this array and save it as pricesString
        // print each and every character in this String  in this format
        //  character at index 1 is :  yourCharacterHere
        //  character at index 2 is :  yourCharacterHere and so on all the way till last
        double[] prices = {123.99,352.99, 943.99};
        System.out.println("Prices : " + Arrays.toString(prices));

        String stringPrice = "A,B,C";
        char[] stringPricesChars=stringPrice.toCharArray();
        for (char string :stringPricesChars) {
            System.out.println(" Each Char StringPrices index 1 -->> " + string);
        }

        for ( double i : prices ){
            System.out.println("character at index 2-->> " + i );
        }


    }
}
