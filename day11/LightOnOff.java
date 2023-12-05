package day11;

import java.util.Scanner;

public class LightOnOff {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Which room light is turned!");
        String targetOption = scan.nextLine();
        switch(targetOption){
            case "Bd":
                System.out.println("You have turned Bedroom light");
                targetOption="Bedroom";
                break;
            case "Lr":
                System.out.println("You have turned Livingroom light");
                targetOption ="Livingroom";
                break;
            case "Ki":
                System.out.println("You have turned Kitchen light");
                targetOption ="Kitchen";
                break;
            case "Ha":
                System.out.println("You have turned Hallway light");
                targetOption = ("Hallway");
                break;
            default:
                System.out.println("There is no light to turn on!!!");

        }
    }
}
