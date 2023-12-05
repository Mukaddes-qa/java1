package day15;

import jdk.swing.interop.SwingInterOpUtils;

public class SubString {
    public static void main(String[] args) {
        // getting the part of the String out f another String
                      //0123456789012345
        String movie = "Lord Of The Ring";
        System.out.println(movie);
        // Sub string will return part of another string
        //starting from beginning index until right before ending index

        String wordOf = movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);
        // I want to get the word of from this movie


        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " +wordThe);

        // Get the second word till last word!
        //
        // String movie = "Lord Of The Ring";

       // int startingPoint = movie.indexOf("") +1;
        // int endingPoint = movie.length();

        // assume we already know the location of starting point of second word
        // and the ending of the sentence
        String secondWordTillLast = movie.substring(5,16);
        System.out.println("second Word TillLast = " + secondWordTillLast);
        String worldLordOf = movie.substring(0,7);
        System.out.println("worldLordOf = " + worldLordOf);
      // if you want to start from somewhere and just get the rest of the String
        //above method will work , however there is even better method
        // if you provide only one parameter to substring method
        // it will just start from that location and get till the end

        String  secondToLast = movie.substring(5);
        System.out.println("secondToLast = " + secondToLast);

        // with this in mind "TASK"
        //you know the index already
        //  //0123456789012345
        //        String movie = "Lord Of The Ring";
        // turn  lord of the string ====>> riing of the Lord
        //1. yontem
        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4,12);
        String worldLord = movie.substring(0,4);
        System.out.println(wordRing + wordOfThe + worldLord);

        // 2.yontem

        System.out.println(movie.substring(12,16)
                +" "+movie.substring(5,7)
                +" "+movie.substring(8,11)
                +" "+movie.substring(0,4));

        // TURN --->> Lord Of The  Ring ---->> Ring Of tHe JAVA LORD

        System.out.println(wordRing + wordOfThe + "JAVA " + worldLord);


        //  System.out.println("second word till last : " + movie.substring(startingPoint,endingPoint));

    }
}
