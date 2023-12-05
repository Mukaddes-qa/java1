package Office_hours;

public class StringMethod {
    public static void main(String[] args) {
        //data types : primitive   non primitive
        /*
        primitive : Byte short int long float double char boolean
        non primitive :Scanner String Array
         */
        int number = 6;
        String word ="java";

        // replace j--->> c
        System.out.println(word.replace("j", "c"));
        System.out.println(word); //java
        System.out.println("word"); //word
        System.out.println(number); //6
        System.out.println(number+6); //6+6=12

        System.out.println(word.length());  //4
        System.out.println("I have 8" +(1+4));  //85
        System.out.println((2+3)+(3+5)); //13

        String book = "learn java in 1 day";
        System.out.println(book.length());
        System.out.println(book.charAt(0)); // -->l
        System.out.println("I am looking for a space " + book.charAt(5)); //---->nothing

        String student = "Rabia";
        System.out.println(student.substring(0)); // -->> Rabia
        System.out.println(student.substring(2)); // --> bia

        System.out.println(student.substring(0,1)); // -->R
        System.out.println(student.substring(0,4)); // --->Rabi
        // trim
        String A = "  Asiya  ";
        System.out.println(A.trim()); // "Asiya"

    }
}
