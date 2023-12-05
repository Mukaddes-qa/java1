package day27;

public class Multi_D_ArraysTask {
    public static void main(String[] args) {
        int[][] numbers = {{12, 11, 10, 19}, {19, 20, 15},{100, 90, 89, 7888}, {900, 800, 600, 500}};
        int max = numbers[0][0];  // assume tht first element is max

        for (int i = 0; i < numbers.length; i++) { // checks each single dimensional array
            for (int j = 0; j < numbers[i].length; j++) { // check each elements in the single dimensial array
                if (max < numbers[i][j]) { // compares index 0 of the array with each indexes
                    max = numbers[i][j]; // assigns the maximum number
                }
            }
        }
        System.out.println(max);

        // solution 2
        int max2 = numbers[0][0];
        for (int[] each1DArray : numbers) { // variable each1DArray represent each single dimensial array
            for (int eachInt : each1DArray) {
                if (max2 < eachInt) {
                    max2 = eachInt;
                }
            }
        }
        System.out.println(max2);

        // finding minimum number
        int min = numbers[0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(min>numbers[i][j]){
                    min=numbers[i][j];
                }
            }
        }
        System.out.println(min);
        System.out.println("======================");


    }
}