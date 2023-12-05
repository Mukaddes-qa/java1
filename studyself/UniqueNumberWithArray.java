package studyself;

import java.util.Arrays;

public class UniqueNumberWithArray {
    public static void main(String[] args) {
        // Write a program that can print out the unique values from an int Array
        //        Ex:
        //            if arr -> {1,1,2,3,3}
        //              output: 2
        int[] number={1,1,2,3,3};

        int count=0;
        for (int i = 0; i <number.length ; i++) {
            if(number[i]==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
