package day34;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MethodOverLoadingIntro {
    public static void main(String[] args) {
        System.out.println("Method overloading");
        System.out.println(12);

                    // 01234567890
        String name = "Overloading" ;
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));

        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));
        System.out.println("---------------------");
        // Arrays.toString() has 9 different version to accept different parameter
        // Method overloading :
        // using same name and different parameter for methods
        // to reuse the name for similar actions
        //WE CAN NOT HAVE SAME METHOD NAME AND PARAMETERS
         sayHello();
         sayHello("Universe");
         sayHello(100);
        sayHello('b',15);
        System.out.println(sayHello("Mukaddes","Kaygusuz"));
    }
    public static void sayHello(){
        System.out.println("Hello , World");
    }
    public static void sayHello(String name){
        System.out.println("Hello, " + name);
    }
    public static void sayHello(int num){
        System.out.println("Hello, " + num);
    }
    public static void sayHello(char ch , int num) {
        System.out.println("Hello, " +ch + num);
    }
     // this is regarded  as same method as above method
  //  public static void sayHello(){

   // }
    public  static String sayHello(String firstName,String lastName){
        return "Hello "+ firstName + " " + lastName;
    }
}
