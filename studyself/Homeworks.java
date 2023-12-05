package studyself;

import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
            String sentence = scan.nextLine();

            int lastCharIndex= sentence.length()-1;
            int jaCount=0;
            int pyCount=0;
            for(int i =0;i<lastCharIndex-3; i++){
                String current4ccharacters=sentence.substring(i,i+4);
                if(current4ccharacters.equalsIgnoreCase("Java")){
                    jaCount++;}}
            for(int i =0;i<lastCharIndex-5; i++){
                String current4ccharacters=sentence.substring(i,i+6);
                if(current4ccharacters.equalsIgnoreCase("python")){
                    jaCount++;}}
            if(jaCount==pyCount) {
                System.out.println("true");
            }else{
                System.out.println("false");
        }
    }

}

