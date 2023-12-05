package studyself;

import java.util.Arrays;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] split=str.split(", ");


        int smallestWordLenght=split[0].length();
        for(int i=1;i<split.length;i++){
            if(split[i].length()<smallestWordLenght){
                smallestWordLenght=split[i].length();
            }
        }
        String smallestWord="";
        for(int i=0;i<split.length;i++){
            if(split[i].length()==smallestWordLenght){
                smallestWord+=(split[i]+" ");
            }
        }

        String[] splitSmall=smallestWord.split(" ");
        Arrays.sort(splitSmall);
        System.out.println(Arrays.toString(splitSmall));

    }
}
