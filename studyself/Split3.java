package studyself;

import java.util.Arrays;
import java.util.Scanner;

public class Split3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] split = str.split(", ");
        String smallest = split[0];

        for(String newString: split){
            if(newString.length() < smallest.length()){
                smallest = newString;
            }
        }

        String smallestList = smallest;
        for(String lastOne: split){
            if(lastOne.equals(smallest)){
                continue;
            }
            else if(lastOne.length() == smallest.length() ){
                smallestList += ", " + lastOne;
            }
        }

        String[] sorted = smallestList.split(", ");
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));
    }
}
