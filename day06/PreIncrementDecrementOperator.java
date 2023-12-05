package day06;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {
        // initializing (giving value ) offerCount value of 2
         int offerCount = 2;

         //increasing the number by one using normal way ;
        offerCount = offerCount + 1;

        // this is increasing the value by one using compound/shorthand operator
        offerCount += 1;

        // Since increasing or decreasing a value very special
        // and often used in programming
        //There is even shorter shortcut for this operation
        // amd we use ++ or -- , THIS EXCLUSIVELY FOR INCREASING OR DECREASING BY 1
        // We can not use it for any other time increasing value by more than one


        ++ offerCount; // this is same as offerCount +=1 ; and this offerCount = offerCount +1 ; its jus better
        System.out.println("Offer Now " + offerCount);

        --offerCount;
        System.out.println("Offer now after decreasing by one " + offerCount);
    }

}
