package day27;

import Notes.Array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {
    public static void main(String[] args) {
        int num=10;
        int[] arr = {10,20,30,40,50,60};
        // length: returns the total number of element from the array
             //   last index num:arr.length-1
        int num1=arr[arr.length-1];
        System.out.println(num1);

        // expected 10, 20, 30, 40, 50, 60
        for (int x = 0; x <=arr.length-1 ; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println();
        // [10, 20, 30, 40, 50, 60]
        String str = Arrays.toString(arr);
        System.out.print(str);
        System.out.println();

        //Task01: write a java program that ask users to enter a number 5 times,
        // and store those number into array

        int[] numbers= new int[5];
        System.out.println(Arrays.toString(numbers));
        Scanner scan = new Scanner (System.in);

        for (int i =0 ; i < 5; i++){
            System.out.println("Enter a number:");
            int input = scan.nextInt(); // returns int data type
            numbers[1] = input;
        }
        System.out.println(Arrays.toString(numbers));

        // Arrays.sort(variableName); sorts the array in ascending order
        Arrays.sort(numbers);

        int largestNumber = numbers[numbers.length-1];
        int minNumber = numbers[0];
        System.out.println("Largest number is : " + largestNumber);
        System.out.println("Minimum number is : " + minNumber);

        //Task2  write a program than can find the minimum number from int array
    }

}
