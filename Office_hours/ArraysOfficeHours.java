package Office_hours;

import java.util.Arrays;

public class ArraysOfficeHours {

    public static void main(String[] args) {
        int a = 'A';
        int[] arr = {10,(byte)9,(short)8, 'a'};
        System.out.println(Arrays.toString(arr));

        long l1=100; // implicity by default 100 is an integer , and we
        int num1=(int)l1; // explicit

        System.out.println(arr[arr.length-1]); // data at last index

        int[] arr2= {0,0,0};
        for(int each : arr2){
            System.out.println(each);
        }

        System.out.println("======================");
        for (int i = 0; i <4 ; i++) {
            System.out.println(i);
            if(i==2)
                continue;
            System.out.println(i + "printed by continue"); // continue mean not printed
        }
        System.out.println("======================");
        for (int i = 0; i <4 ; i++) {
            System.out.println(i);
            if(i==2)
                break; // break mean exit the loop immediately
            System.out.println(i + "printed by break"); // break ---> 0 1
        }
        //tASK1 : write a program that can check if a string is build out of the same letters as another string
        String str1 = "abc", str2="cbb"; // expected result: false
        // split(), toCharArray();
        char[] arr1= str1.toCharArray(); // [a,b,c];
        Arrays.sort(arr1); // arr1=[a,b,c];

        char[] ar2= str2.toCharArray(); // [c,b,b];
        Arrays.sort(ar2); // arr1=[b,b,c];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(ar2));

       str1= Arrays.toString(arr1);
       str2=Arrays.toString(ar2);
        System.out.println(str1.equals(str2)); // true or false
        System.out.println("============================================");
        //TASK2 :Write a program that will remove all the duplicates from a string
        //				Do it withg Arrays only

        String s1= "aaabbaaccbbdd"; // expected result abcd
        String s2 = "";  // we store non duplicated characters in it

        for (int i = 0; i <s1.length() ; i++) {
            String eachChar="" + s1.charAt(i);  // a

            if(!s2.contains(eachChar)) {
                s2 += eachChar;// we only concat character if that character is not exist in s2
            }
        }
        System.out.println(s2); // it gives same----->> aaabbaaccbbdd
        // solution two
        String fiveMinutes = "abcabc";
         String []  EachChar=fiveMinutes.split("");
         String result ="";  // to store all non duplicated String onjects of the array
         for(String each : EachChar){
             if(!result.contains(each)) {
                 result += each;
             }
         }
        System.out.println(result);
    }
}
