package studyself;

import java.util.Arrays;
import java.util.Scanner;

public class Split2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //code starts here

        String[] arr = str.split(", ");

        //find the shortest word and find only one word
        String shortest = arr[0];
        int shortestLength = arr[0].length();
        for (String s : arr) {
            if (s.length() < shortestLength) {
                shortest = s;
                shortestLength = s.length();
            }
        }
        //find how many words have shortest length
        int count=0;
        for (String s : arr) {
            if (s.length() == shortestLength) {
                ++count;
            }
        }

        String[] arr2 = new String[count];

        //store all shortest words inside arr2 array.
        int index=0;
        for (String s : arr) {
            if (s.length() == shortestLength) {
                arr2[index] = s;
                ++index;
            }
        }
        //sort and print arr2 with shortest words
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
