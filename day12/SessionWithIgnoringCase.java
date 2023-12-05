package day12;
import java.util.Scanner;

public class SessionWithIgnoringCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season Please: ");
        String season = scan.nextLine();

        if (season.equalsIgnoreCase("SPRING")){
            System.out.println("Hiking , Newruz, Alergy Season, Cool weather");
        }else if(season.equalsIgnoreCase("SUMMER")){
            System.out.println("Pool, Swimming, Beach, Vacation");
        }else if (season.equalsIgnoreCase("FALL")){
            System.out.println("Barbecu, Riding Bike, JUST CODE, !!!!!, Halloween");
        }else if(season.equalsIgnoreCase("WINTER")){
            System.out.println("CODE!!!!!, Ski, Sleeding, Snowman");
        }
    }
}
