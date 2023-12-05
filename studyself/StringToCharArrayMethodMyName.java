package studyself;

import java.util.Arrays;

public class StringToCharArrayMethodMyName {
    public static void main(String[] args) {
        // pick up your own name and turn in into char array and use for each loop to loop over them
        // optionally count how many a you have in your name

        String myLastName= "Kaygusuz";
        String myName = "Mukaddes";
        char[] myNameChars = myName.toCharArray();
        System.out.println("My name char array : " + Arrays.toString(myNameChars));
        int count = 0;
        for (char eachChar : myNameChars) {
            count++;
        }

        for (char eachChar : myNameChars) {
            System.out.println("My First Name Each Char = " + eachChar);
        }
        System.out.println("My first name count = " + count);
        System.out.println();

        char[] myLastNameChars=myLastName.toCharArray();
        System.out.println("My last name char array : " + Arrays.toString(myLastNameChars));
        for(char eachChar2:myLastNameChars){
            System.out.println("My Last Name Each Char : " + eachChar2);
        }
        int count2=0;
        for (char eacChar2:myLastNameChars){
            count2++;
        }
        System.out.println("My Last name count = " + count2);


    }

}
