package studyself;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEachCharacter {
    public static void main(String[] args) {

    String sentence = ("Keep Calm! Everything will be Great!");

        List<Character> all=convert(sentence);
        System.out.println("all = " + all);

    }
    public static List<Character> convert (String sentence){
        List<Character> listOfSentence= new ArrayList<>();

        for (char each:sentence.toCharArray() ){
            listOfSentence.add(each);
        }
        return listOfSentence;
    }
}
