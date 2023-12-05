package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int x = 10;
        //Primitive data types are pure value has no attribute or behaviour
        // each primitive type has wrapper class that turn it into object so we can treat it

        // this is the old not recommended way of create Integer Object

        Integer x1 = new Integer(12); // String str = new String ("abc");
        Integer x2 = Integer.valueOf(12);
        Integer x3 = Integer.valueOf("12");

       byte bValue = x2.byteValue();
        System.out.println("byte Value = " + bValue);

        double dValue = x2.doubleValue();
        System.out.println("double Value = " + dValue);
    }
}
