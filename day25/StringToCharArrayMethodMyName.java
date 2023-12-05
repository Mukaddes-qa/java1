package day25;

import java.util.Arrays;

public class StringToCharArrayMethodMyName {
    public static void main(String[] args) {
        // pick up your own name and turn in inti char array and use for each loop to loop over them
        //optionally count how many a you have in your name
        // turn this into CharArray using toCharArray
        String myName= "Mukaddes";
        char[] myNameChars=myName.toCharArray();
        System.out.println("My name Chars = " + Arrays.toString(myNameChars));

        String myLastName = "Kaygusuz";
        char [] myLastNameChars = new char[myLastName.length()];
        for (int x = 0; x < myLastNameChars.length; x++) {
            myLastNameChars[x]=myLastName.charAt(x);
        }
        System.out.println("My Name Last Chars = " + Arrays.toString(myLastNameChars));

       String myFirstLastName= "Ayik" ;
       char[] allCharsInName=myFirstLastName .toCharArray();
       for(char eachChar: allCharsInName){
           System.out.println("Each Char = " + eachChar);
       }
       // now count how many a we have
        int count=0;
       for(char eachChar: allCharsInName){
           if(eachChar=='a'){
               count++;
           }
       }
        System.out.println("Count = " + count);

       // What if you want to sort all caharacters of your name
        // in aplhabetical order?
        Arrays.sort(allCharsInName);
        System.out.println("allCharsInName = " + Arrays.toString(allCharsInName));
    }
}
