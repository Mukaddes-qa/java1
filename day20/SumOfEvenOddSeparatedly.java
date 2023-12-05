package day20;

public class SumOfEvenOddSeparatedly {
    public static void main(String[] args) {
        int sumOfEven=0;
        int sumOfOdd=0;
        for (int i = 0; i <100 ; i++) {
            if(i%2!=0){
                sumOfOdd = sumOfOdd+i;
            }else{
                sumOfEven= sumOfEven+i;
            }

        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);
    }
}
