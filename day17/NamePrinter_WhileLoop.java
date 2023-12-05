package day17;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {
        String name = "Alexander";
        int x = 0;
        System.out.print(name.charAt(x));
        ++x;
        System.out.print(name.charAt(x));
        ++x;
        System.out.print(name.charAt(x));
        ++x;
        System.out.print(name.charAt(x));
        ++x;
        System.out.print(name.charAt(x));
        ++x;
        System.out.print(name.charAt(x));
        ++x;
        System.out.print(name.charAt(x));
        ++x;
        System.out.print(name.charAt(x));
        ++x;
        System.out.print(name.charAt(x));
        ++x;


        int a = 0;
        while (a<name.length()){
            System.out.print ("index" + a + " : ");
            System.out.println(name.charAt(a));
            ++a;
        }


    }


}
