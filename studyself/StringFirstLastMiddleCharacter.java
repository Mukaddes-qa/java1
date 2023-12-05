package studyself;

import java.util.Scanner;

public class StringFirstLastMiddleCharacter {
    public static void main(String[] args) {
        String name = "Cybertek";
        int charCount = name.length();

        System.out.println("First caharacter: " + name.charAt(0));
        System.out.println("Last caharacter:" + name.charAt(charCount-1));

        // 012345678       012345
        // statement       uyghur
        // 8/2=4            5/2=2 ----->> for middle
        int middleIndex=(charCount-1)/2;
        System.out.println("Middle index: " + name.charAt(middleIndex));

    }
}
