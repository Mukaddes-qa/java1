package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {
        // this is passing the array object directly into the method
      arrayPrinterItems(new int[]{1,6,5,3,12,3});

        int[] scores = {2,5,8,23,4,5,6};
        arrayPrinterItems(scores);

    printMaxOfIntArray(new int[]{1,9,45,32});
    printMinOfIntArray(new int[]{1,9,45,32});
    printSumOfIntArray(new int[]{1,9,45,32});
    checkScoresAllMoreThan60(new int[]{1,9,45,32,80});

    compare2arraySize(new String[]{"Sezgin","Senay","Astrit"},new String[]{"Araz"});
    String[] name1={"Kagan","Alp"};
    String[] name2={"Osman","Mukaddes","Nisan"};
    compare2arraySize(name1,name2);


    // this is assigning the array object into a variable
        // and then pass it into the method

    }
    public static void arrayPrinterItems (int[] nums){
        System.out.println("Arrays has items : " + Arrays.toString(nums));
        System.out.println();
    }
     public static void printMaxOfIntArray(int[] numbers){
         int max=numbers[0];
         for(int i=0; i<numbers.length; i++){
             if(numbers[i]>max){
                 max=numbers[i];
             }
         }
         System.out.println("max number of array= " + max);
         System.out.println();
     }
     public static void printMinOfIntArray(int[] numbers){
        int min = numbers[0];
         for (int i = 0; i <numbers.length ; i++) {
             if(numbers[i]<min){
                 min=numbers[i];
             }
         }
         System.out.println("min number of array = " + min);
         System.out.println();
     }
     public static void printSumOfIntArray(int[] numbers){
        int sum =0;
         for (int each : numbers) {
             sum= sum+each;

         }
         System.out.println("sum of numbers =  " + sum);

         System.out.println();
     }
     public static void checkScoresAllMoreThan60 (int[]  numbers){
         for (int i = 0; i <numbers.length ; i++) {
             if (numbers[i] > 60) {
                 System.out.println(numbers[i] + " is more than 60 ");
             } else {
                 System.out.println(numbers[i] + " is less than 60");
             }
             System.out.println();
         }
     }
     public static void compare2arraySize(String[] name1,String[] name2) {
         if(name1.length>name2.length){
             System.out.println("Array 1 has more item");
         }else if(name2.length>name1.length){
             System.out.println("Array 2 has more item");
         }else{
             System.out.println("They have same item count");
         }
         System.out.println();
     }
}
