package studyself;

import java.util.Scanner;

public class CatsDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        String wordForDogs = word;
    /*
    01234567890123456
    catgggdogcathhdog
    */
        while(word.contains("cat")){
            word=word.substring(word.indexOf("cat")+3);
            countOfCats++;
        }
        while(wordForDogs.contains("dog")){
            wordForDogs=wordForDogs.substring(wordForDogs.indexOf("dog")+3);
            countOfDogs++;
        }
        if(countOfDogs==countOfCats){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}

