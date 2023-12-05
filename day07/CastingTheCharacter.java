package day07;

import javax.xml.transform.sax.SAXSource;

public class CastingTheCharacter {
    public static void main(String[] args) {

        char grade = 'B' ;
        System.out.println(grade);

        int letterInNumber = 'B';
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);
       //------------------------------------------
        char myFirstChar = (char)100;
        System.out.println(myFirstChar);

        // find out your number of each character in your first name
        char m = 'M';
        char u = 'U';
        char k = 'K';
        char a = 'A';
        char d = 'D';
        char d2 = 'D';
        char e = 'E';
        char s = 'S';

        System.out.println(m);
        System.out.println(u);
        System.out.println(k);
        System.out.println(a);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(e);
        System.out.println(s);

        char letterA = 'a';
        System.out.println( letterA + 1);
        System.out.println(" " + letterA + 1);




    }
}
