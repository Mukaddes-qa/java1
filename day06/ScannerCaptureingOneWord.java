package day06;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class ScannerCaptureingOneWord {
    public static void main(String[] args) {
        Scanner blabla = new Scanner (System.in);

        System.out.println("What is your name ? ");
        String name = blabla.next(); // it will only capture first word (seperated by space )

        int age = blabla.nextInt();

        System.out.println("You have entered " + name);
        System.out.println("You have entered age  " + age);

    }
}
