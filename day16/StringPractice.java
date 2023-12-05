package day16;


import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the keyword to search: ");

        String keywordToSpeech = scan.nextLine();
        String tabTitle = keywordToSpeech + "-Google Search";
        if (tabTitle.startsWith(keywordToSpeech) && tabTitle.endsWith("-Google Search")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}