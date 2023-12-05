package day10;

import java.util.Scanner;

public class SeasonAction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey whats is the season!!!?");
        String season = scan.nextLine();

        switch (season){
            case "Spring":
                System.out.println("Lets go: " + season + "!" + " Hike , Easter, Nawruz, Blassom");
            break;
            case "Summer":
                System.out.println("Lets go: " + season + "!" + " Vacation, swim, bbq");
            break;
            case "Fall":
                System.out.println("Lets go: " + season + "!" + " Halloween, Thanksgiving, Black Friday Shopping!");
                break;
            case "Winter":
                System.out.println("Lets go: " + season + "!" + " Snowbarding , ski , christmas, new year");
                break;
            default:
                System.out.println("Invalid season:)");
        }

    }
}
