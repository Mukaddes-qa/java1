package day08;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int speedLimit = 60;

        int yourCurrentSpeed= 100;

        boolean IamSpeeding = (yourCurrentSpeed>speedLimit);
        //inside patentehesis we can only put
        // boolean value : true false
        // boolean variable
        // any expression that return boolean value

        //if (IamSpeading){
        // if (true) {

        if (yourCurrentSpeed>speedLimit) {
            System.out.println("Get pulled over by the police");
            System.out.println("Given ticket by the pollice ");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        } else {
            System.out.println("Lets go shopping! ");
            System.out.println("Have nice trip!");
        }

    }

}
