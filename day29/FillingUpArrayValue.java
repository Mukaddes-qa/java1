package day29;

import java.util.Arrays;

public class FillingUpArrayValue {
    public static void main(String[] args) {
        // create an array with size 100 and fill it up as below
        // fill up this array with number from 1 to 100

        int [] numbers =new int [100]; // --->>exact number

        System.out.println("Before filling Up default value \n" + Arrays.toString(numbers));
      //  numbers[0]=1;
      //  numbers[1]=2;
        //  numbers[2]=3;
        // .....
        // numbers[99]=100;

        for (int x = 0; x <numbers.length ; x++) {
            numbers[x]=x+1;
        }
        System.out.println("After filling Up \n" + Arrays.toString(numbers));

    }
}
