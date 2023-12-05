package day27;

public class MinimumNumber_ArrayTask {
    public static void main(String[] args) {
        //Task2  write a program than can find the minimum number from int array
        // Do not use sort method

        int[] scores = {100, -99,-1000,2000,5000,0,1,2000};
        int min =scores[0];  // min : 100
        for (int i = 0; i <scores.length ; i++) {
            if(min>scores[i]){
                min= scores[i];
            }
        }
        System.out.println("Minimum number : " + min);

        int secondMin = scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i]== min){
                continue;
            }
            if(secondMin>scores[i]){
                secondMin=scores[i];
            }
        }
        System.out.println("Second minimum number is : " + secondMin);

        int thirdMin = scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i] == min || scores[i]== secondMin){
                continue;
            }
            if(secondMin>scores[i]){
                secondMin=scores[i];
            }
        }
        System.out.println("Third minimum number is : " + thirdMin);
    }
}
