package day30;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        /*what does split do?
        it will split the string into multiple part

        What do i need to provide calling it ?
        We need to provide the seperator

        What do i get out of it?
        We get a String array out of it with each part splitted

        DOES IT ACTUALLY CHANGE YOUR ORIGINAL STRING?
        NO!!!!!!

         */


        String car ="Lexus-LS-F";
        String [] carSplitted = car.split("-",2);
        System.out.println("carSpiletted = " + Arrays.toString(carSplitted));
        System.out.println("car = " + car);

        String model = carSplitted[1];
        System.out.println("model = " + model);
        
    }
}
