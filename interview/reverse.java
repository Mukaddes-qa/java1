package interview;

import java.util.Scanner;

public class reverse {
        public static void main(String[] args) {

            //What are different way to create string object in java
            String first = "Mike"; // stack memory
            String second = new String("Suzan");// heap memory

            char[] ch = {'s', 'c', 'o', 't', 't'};
            String third = new String(ch);

            System.out.println(first);
            System.out.println(second);
            System.out.println(third);

            //String is a class.String is a sequence of character.String is immutable
            String name = "mike";
            String name2 = new String("mike");

            name.concat("suzan");//stack memory
            name = name.concat("suzan");//heap memory
            System.out.println(name);

            //convert int or Integer to string
            int num = 123;
            String abc = Integer.toString(num);
            System.out.println(abc);

            int nums = 1234;
            ;
            String k = String.valueOf(num);
            System.out.println(k);

            //convert String to integer
            String number = "10";
            int result = Integer.parseInt(number); //par


            String word= "Today is cold";
            String reverse1="";
            String[]arr= word.split(" ");
            for (int i = arr.length-1; i >=0 ; i--) {
                reverse1+=arr[i]+" ";
            }
            System.out.println(reverse1);


        }

   public void Reverse(){
      Scanner scan = new Scanner(System.in);
      System.out.println("pleas enter a sentence");
      String sentence = scan.nextLine();


      String[]arr=sentence.split("");
      for(int i=arr.length-1; i>=0; i--){
          sentence+=arr[i]+" ";
      }
      System.out.println(sentence);
   }

    }