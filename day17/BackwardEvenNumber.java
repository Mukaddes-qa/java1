package day17;

public class BackwardEvenNumber {
    public static void main(String[] args) {
        int evenNumber = 100;
        while (evenNumber >= 0) {
            if (evenNumber % 2 == 0) {
                System.out.println(evenNumber + " is even number");
            }else{
                System.out.println(evenNumber + " is odd number");
            }
            --evenNumber;
        }

        int x =100;
        while (x>0){
            if(x%2==0){
                System.out.println(x + " is even number");
            }
            --x;
        }



    }
}
