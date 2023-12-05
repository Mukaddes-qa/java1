package day14;

public class IndexOfPractice {
    public static void main(String[] args) {
        // indexOf ---->>
        // find out index of another String inside This String
                      // 012345678
        String name = "Game of Java"; // lenght is 12 , last char index is 11
        // find out the location of java
        // find out the location of letter 0
        // find out the location of first space
        System.out.println("find out the location of Java");
        System.out.println(name.indexOf("Java"));

        System.out.println("find out the location of o");
        System.out.println(name.indexOf("o"));
     // if the location is not found , we get minus number
        System.out.println("find out the location of 0");
        System.out.println(name.indexOf("0"));

        // find out the location of first space
        System.out.println("find out the location of first space ");
        System.out.println(name.indexOf(" "));



    }
}
