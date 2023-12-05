package day25;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {
        String sentence = "I love java";
        // WHAT DOES IT DO ?
        // toCharArray() is a method of String that turn string into char array
        // DO I NEED TO PROVIDE EXTRA DATA WHILE CALLING THE METHOD ?
        // NO
        // WHAT DO I GET OUT OF IT ?
        // char array object that has all the characters of the String object
        String[] allWords = sentence.split(" ");
        System.out.println("Arrays.toString(allWords) = " + Arrays.toString(allWords));
        System.out.println("How many word do I have in this sentence? :" +allWords.length);

        // How do I get the last word of the seentence using this array i GOT from String
        System.out.println("Last word in this sentence is " +allWords[allWords.length-1]);
        
        // ARE WE LIMITED TO SPLIT BY SPACE OR WE CAN SPLIT BY ANYTHING ? ---> ANYTHING
        
        String sentence2 = " Everthing is Awesome!!!";
        // split by letter e
        String[] splitBy_e_Arr = sentence2.split("e");
        System.out.println("Arrays.toString(splitBy_e_Arr) = " + Arrays.toString(splitBy_e_Arr));

        for(String  eachPieces: splitBy_e_Arr){
            System.out.println("eachPieces = " + eachPieces);
        }

        // split this sentences by is and print out your result
        String[] splitBy_is_Arr= sentence2.split("is");
        System.out.println("Arrays.toString(splitBy_is_Arr) = " + Arrays.toString(splitBy_is_Arr));
    }
}
