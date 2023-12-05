package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
        // checkig for String equality should be always
        // done using equals method of the String

        // oneString.equals(anotherString) --->> true or false
       // equals method coming from String clas
        // each and every String object you created will have this functionality

        // just comparing 2 String literal directly using equals ,method
        // This is something that you will rarely
        // System.out.rpintln ("Java".equals("Java")
        System.out.println("Java".equals("Java")); // case sensetive

        String myStr = "Java";
        System.out.println(myStr.equals("Java"));
        // intellij display original as helper , its not part of your code
        //please ignore and keep trying . do not type original just type your text

        String yourStr = new String("Java");

        System.out.println("is my string same as your string? ");
        // how to compare yourStr for equality
        System.out.println(myStr.equals(yourStr));

        //Create a program to check whether myStr value is Java
        //if true -->> CORRECT WORD!!!!!
        //if false ---- SAY JAVA!!!!

        if(myStr.equals("Java")){
            System.out.println("it is equal");


        }
    }
}
