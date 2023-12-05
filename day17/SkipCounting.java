package day17;

public class SkipCounting {
    public static void main(String[] args) {
        // Skip counting by 3 from 0 till 30
        // 3 6 9 12 15 18 21 24 27 30
        int counter = 0;
        while (counter<30){
            counter +=3;
            System.out.print(counter + " ");

        }
        System.out.println(" ");
        int evenNumber = 0;
         while(evenNumber <=50){
             System.out.print( evenNumber + " ");
             evenNumber +=2;

         }
        System.out.println(" ");
         int oddNumber = 1;
         while (oddNumber<=50){
             System.out.print(oddNumber +  " ");

             oddNumber+=2;
         }

        System.out.println("---------------------");
         int evenNumber2 = 20;
         if(evenNumber2 %2 == 0){
             System.out.println(evenNumber2 + " is even number");
         }else{
             System.out.println(evenNumber2 + " is odd number");
         }
         ++evenNumber2;


        System.out.println("---------------------------------");

         int oddNumber2 = 21;
         if (oddNumber2 %2==1){
             System.out.println(oddNumber2 + " is odd number");
         }else{
             System.out.println(evenNumber2 + " is even number");
         }
         ++oddNumber2;

    }
}
