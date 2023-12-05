package studyself;

public class SumOfEvenOddAverageNumbers {
    public static void main(String[] args) {
        //        create an int array of 6 elements and find out
//        average of the array
//        sum of all elements
//        sum of even numbers in the array
//        sum of odd numbers in the array
//        max number in the array
//        min number in the array
        int[] numbers = new int[]{21,11,35,76,83,91};

        // Average
        int average =numbers[5];
        for(int sum:numbers){
            average=sum/5;
        }
        System.out.println("Average of Numbers : " + average);

        // sum of even number
        int sumEvenNumber=0;
        for(int EvenNumber:numbers) {
            if(EvenNumber % 2 == 0) {
               sumEvenNumber=sumEvenNumber+ EvenNumber;
                System.out.println("Sum of even Numbers : " + sumEvenNumber);
            }
        }
        // sum of odd number
        int sumOddNumber=0;
        for(int oddNumber:numbers) {
            if(oddNumber % 2 == 1) {
                sumOddNumber=sumOddNumber+ oddNumber;
                System.out.println("Sum of odd Numbers : " + sumOddNumber);
            }
        }
        // Max number
        int max = numbers[0];
        for (int k = 0; k <numbers.length ; k++) {
            if(numbers[k]>max){
                max=numbers[k];
            }
        }
        System.out.println("Max of the numbers : " + max);

        // Min number
        int min = numbers[0];
        for (int x = 0; x <numbers.length-1 ; x++) {
            if(numbers[x]<min){
                min=numbers[x];
            }
        }
        System.out.println("Min of the numbers : " + min);
    }
}
