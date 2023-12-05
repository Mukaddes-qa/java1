package day13;

public class StringMethods {
    public static void main(String[] args) {
        // equals
        String s1= "hello";
        System.out.println(s1.equals("abc"));
        // equalsIngnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));
       // toUpperCase method of String is used to make String all character uppercase
        System.out.println(s1);
        System.out.println(s1.toUpperCase());

        //toLowercase method of String is used to make String all character lowercase
        System.out.println(s1.toLowerCase());

        String my = "Mukaddes";

        System.out.println("MY NAME IS : " + my.toUpperCase());
        System.out.println("my name is : " + my.toLowerCase());

        System.out.println(my.length());

        int lengthOfStr = s1.length();
        if(lengthOfStr>4){
            System.out.println("More than 4 character");
        }else{
            System.out.println("Not more than 4");
        }
    }
}
