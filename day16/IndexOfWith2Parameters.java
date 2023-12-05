package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {

        // get the second java from sentence
        // assume you already know there us 4 Java in this sentences
        // second java means ---->> The java showed up after first Java
        //first find out where is location of the first java showed up
        //in order the find the second one
        // instead of searching from begining , search from
        // search from right after the location you found first java
        // then it will give give you the index of second java

        // BUT HOW DO I START FROM DIFFERENT LOCATION WHEN USING INDEXOF
        // BECUSE INDEX OF ALWAYS START BEGINING

        // indexOf method has 2 version 1 except 1 external data
        // another expect 2 external data ---->> yourString.indexOf()

        //            01234567890123456789012345
        String name = "I love Java I love Java Java Java";

        System.out.println(("Starting from 0 " + name.indexOf("Java")));
        System.out.println(("Starting from 7 " + name.indexOf("Java", 7)));
        System.out.println(("Starting from 8 " + name.indexOf("Java", 8)));
        System.out.println(("Starting from 9 " + name.indexOf("Java", 9)));
        System.out.println(("Starting from 19 " + name.indexOf("Java", 19)));
        System.out.println(("Starting from 20 " + name.indexOf("Java", 20)));

        // How do i start from the location that get past first java
        // basically starting point different that 0 so that it get past first Java

        int firstJavaLocation = name.indexOf("Java"); // location of first java in this case 7
        
        // starting point can be right after the index of first character of word
        // or you can start here +4
        // or you can start write after you finish the word you are searching, for the java +4
        // if we do not know the length of the word --->> + word.length()
        int startingPointToSearchSecondJava = firstJavaLocation + 1;
        int secondJavaLocation= name.indexOf("java" , startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        //I do not know how many word in this sentence.I only know there 3+ words
        // i just want to know what is the second
        // the word in between first space and second space is second word
        
        int firstSpaceLocation= name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstSpaceLocation+1);
        System.out.println("second word in this sentence is  "
                + name.substring(firstSpaceLocation+1,secondSpace));


    }
}
