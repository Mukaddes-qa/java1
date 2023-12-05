package Office_hours;

import java.util.Arrays;

public class Practice_12_30 {
    public static void main(String[] args) {
        int a =10;
        Integer A= a;

        float f =0.5f;

        Double num1 =0.5;
        Short num3 =45;
        Integer num4 =100;

        double num2 = num4;
        System.out.println(num2);

        Long number1 = 100L ; // Auto

        Float f1 = 100.0f;

        double d1=f1; // unboxing
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Double.MAX_VALUE =" + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE =" + Double.MIN_VALUE);

        String str1 = "123";
        int result =Integer.parseInt(str1);
        System.out.println((str1+1)); // 1231
        System.out.println(result+1);  // 124

        String str2 = "TRUE";
       boolean r1= Boolean.parseBoolean(str2);
        System.out.println(r1); // true
        System.out.println(r1==false); // false

        String str3 = "FaLSe";
        boolean r2= Boolean.parseBoolean(str3);
        System.out.println(r2); // false

        String str4 = "Yes or No";
        boolean r3= Boolean.parseBoolean(str4);
        System.out.println(r3); // false

        //Value Of;
        String s1 = "100.5";
        Double C1= Double.parseDouble(s1);
        Double c2 = Double.valueOf(s1);

        System.out.println(C1); // 100.5
        System.out.println(c2); // 100.5

        String s2="TrUE";
        Boolean b1 = Boolean.valueOf(s2);
        System.out.println(b1); // true

        Boolean[] arr = new Boolean[3];
        System.out.println(Arrays.toString(arr)); //[null, null, null]

        String name = "string";
        String name1 = new String("string");

        Integer I1 = new Integer ("123"); // it is not accepted

        char myChar = '7';
        //how do I turn character into an int
        int myNum = Integer.parseInt(myChar+"");
         //inside ( ) we can also write :
        //Character.toString(myChar); one option
        //String.valueOf(myChar);
    }
    public  static int addNum(int a , int b){
        return a+b;
    }
    public static double addNum(double a, double b){
        return a+b;
    }
}
