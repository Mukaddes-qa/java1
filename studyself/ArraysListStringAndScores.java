package studyself;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraysListStringAndScores {
    public static void main(String[] args) {
        ArrayList<String> scores = new ArrayList<>();
        scores.add("76");
        scores.add("54");
        scores.add("100");
        scores.add("89");
        scores.add("44");
        scores.add("95");
        checkScores(scores);
        moreThan90(scores);
        averageScores(scores);
        scoreGrade(scores);
    }
    public static void checkScores (ArrayList<String> scores){
        for (int i = 0; i <scores.size() ; i++) {
            if (Integer.parseInt(scores.get(i))<60) {
                System.out.println(scores.get(i)+"--->>"+" It is Failed");
            }else {
                System.out.println(scores.get(i)+"--->>"+" It is Passed");
            }
        }
    }
    public static void moreThan90 (ArrayList<String> scores){
        int count=0;
        for (int i = 0; i <scores.size() ; i++) {
            if (Integer.parseInt(scores.get(i))>90){
                ++count;
            }
        }
        System.out.println("More than 90--->> " + count);
    }
    public static void averageScores (ArrayList<String> scores){
        int sum=0;
        int average=0;
        for (int i = 0; i <scores.size() ; i++) {
            sum+=Integer.parseInt(scores.get(i));
        }
        average=sum/scores.size();
        System.out.println("Average score is --->>" + average );
    }
    public static void scoreGrade (ArrayList<String> scores) {
        for (int i = 0; i < scores.size(); i++) {
            if (Integer.parseInt(scores.get(i)) <= 100 && Integer.parseInt(scores.get(i)) >= 90) {
                System.out.println(scores.get(i) +"--->>"+ "A");
            } else if (Integer.parseInt(scores.get(i)) <= 90 && Integer.parseInt(scores.get(i)) >= 80) {
                System.out.println(scores.get(i) +"--->>"+ "B");
            } else if (Integer.parseInt(scores.get(i)) <= 80 && Integer.parseInt(scores.get(i)) >= 70) {
                System.out.println(scores.get(i) +"--->>"+ "C");
            } else if (Integer.parseInt(scores.get(i)) <= 70 && Integer.parseInt(scores.get(i)) >= 60) {
                System.out.println(scores.get(i) +"--->>"+ "D");
            } else if (Integer.parseInt(scores.get(i)) <= 60 && Integer.parseInt(scores.get(i)) >= 30) {
                System.out.println(scores.get(i) +"--->>"+ "F");
            }
        }
    }
}