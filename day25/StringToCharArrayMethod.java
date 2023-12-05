package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {
        String name= "Aleysa";
        // how would you store each and every character
        //to an char array from above name
        //without using method we are about to learn
        char[] namesChar = new char[name.length()];

       // namesChar[0] = name.charAt(0);
       // namesChar[1] = name.charAt(1);
        // namesChar[2] = name.charAt(2);
        // namesChar[3] = name.charAt(3);
        // namesChar[4] = name.charAt(4);
        // namesChar[5] = name.charAt(5);

        // using for loop tp fill up the array one by one
        for (int x = 0; x<namesChar.length ; x++) {
            // take each character of name and fill the char array values
            namesChar[x]=name.charAt(x);
        }
        System.out.println("namesChars = " + Arrays.toString(namesChar));

        char[]namesChar2 = name.toCharArray();
        System.out.println("namesChar2= " + Arrays.toString(namesChar2));

    }
}
