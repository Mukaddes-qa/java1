package day06;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = scan.nextLine();
        System.out.println("You have entered " + name );

        System.out.println("Which city you live , including state?");
        String cityAndState = scan.nextLine();
        System.out.println("You have entered City and State : " + cityAndState);

        System.out.println("What is your street address");
        String streetAddress= scan.nextLine();
        System.out.println("You have entered street address " + streetAddress);

    }
}
