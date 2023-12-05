package day29;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumber {
    public static void main(String[] args) {
        // create an array with size 100 and fill it up as below
        // fill up this array with number from 1 to 100

        int [] numbers =new int [100]; // --->>exact number

        System.out.println("Before filling Up default value \n" + Arrays.toString(numbers));
        numbers[0]=0;
        numbers[1]=2;
        numbers[2]=4;
        numbers[3]=6;
        numbers[4]=8;
        numbers[5]=10;
        //.....
        numbers[99]=198;
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=i*2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
