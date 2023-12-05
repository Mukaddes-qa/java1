package day11;

public class StringEquality {
    public static void main(String[] args) {
        // String name = "Rabia";

       /* char c1= 'b' ;
        char c2= 'B' ;
        char c3 = 'b';
        System.out.println("is c1 equal to c2");
        System.out.println(c1==c2);

        System.out.println("is c1 equal to c3");
        System.out.println(c1 == c3);

        // all primitive types can be compared using ++ for their cintent equality
        //primitive types are pure value

        int num1 = 10;
        int num2 = 20;
        System.out.println("is num1 to equal num2");
        System.out.println(num1==num2);*/

       String name = "Rabia" ; // String literal
       String name2 = new String ("Rabia"); // this is object
        String name3= "Rabia";
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("USING == METHODS");
        System.out.println(name==name2);
        System.out.println(name==name3);

        // The correct way of comparing String to get consistent result is
        // using one of the String object behaivour / method called
        // equals method
        // str1.equals(str2)
        System.out.println("USING EQUALS METHOD");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

    }
}
