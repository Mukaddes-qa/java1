package day03;

import javax.swing.*;

public class PrimitivesPractice {
    public static void main(String[] args) {


        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount  );

        short sheepCount = 300;
        System.out.println("The sheep count is " + sheepCount);

        int catCount = 20;
        System.out.println("The cat count is " + catCount);

        long mileToMoon = 500000l;
        System.out.println("The mile to moon is " + mileToMoon);

        long mileToSun = 1000000L;
        System.out.println("The mile to sun is " + mileToSun);

        // ----------------floating point----------------------------
        // you must add f at the end of number to indicte this is float data type
        //uppercase lowercase does not matter , but it's mandatory

        float priceOfBanana = 1.99f;
        System.out.println("The price of banana is " + priceOfBanana);

        float priceOfPotato = 2.49F;
        System.out.println("The price of Potato is " + priceOfPotato);

        // ---------------larger floating point numbers------
        double priceOfIpad    = 155.99d ;
        System.out.println("The price of ipad is " + priceOfIpad);
        double priceOfIpadPro = 1024.99D ;
        System.out.println("The price of ipad pro is " + priceOfIpadPro);
        // compiler automatically assume it's a double so it's a double so it's not required to have d
        // However for good programming habbit , add them always
        double priceOfMac     = 2299.99 ;
        System.out.println("The price of Mac is " + priceOfMac);

     // if you have a whole number by itself , compiler automatically assume its an int
     // if you have a fractional number by itself , compiler automatically assume its an double





    }
}
