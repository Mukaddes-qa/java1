package studyself;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        /*
        Print true if the string "cat" and "dog" appear the
        same number of times in the given string word.
        Example:
        input: catdog
        output: true

        Example:
        input: catcat
        output: false

        Example:
        input: cat-cheetah-dog-cat
        output: false
         */
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        // code starts here

        int iCat = word.indexOf("cat");
        int iDog = word.indexOf("dog");

        while (iCat != -1) {
            ++countOfCats;
            iCat = word.indexOf("cat", iCat+1);
        }

        while (iDog != -1) {
            ++countOfDogs;
            iDog = word.indexOf("dog", iDog+1);
        }

        System.out.println(countOfCats==countOfDogs);
    }
}


