package day30;

import java.util.Arrays;

public class CarInventory {
    public static void main(String[] args) {
       String[] cars={"carmake-carmodel",
               "Acura-NSX",
               "Chevrolet-Corvette",
               "Chevrolet-Cavalier",
               "BMW-3 Series",
               "Pontiac-LeMans",
               "Oldsmobile-Achieva",
               "Honda-Civic",};
        int chevyCounter = 0,
                civicCounter = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].contains("Chevrolet")) {
                chevyCounter++;
            } else if (cars[i].contains("Civic")) {
                civicCounter++;
            }
        }
        System.out.println("Count of Chevrolet : " + chevyCounter);
        System.out.println("Count of Civic : " +  civicCounter);

    }
}
// What if I want case insensitivity
// if (eachCar.toLowerCase().startsWith("chevrolet"))