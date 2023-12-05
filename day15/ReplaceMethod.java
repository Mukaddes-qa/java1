package day15;

import jdk.swing.interop.SwingInterOpUtils;

public class ReplaceMethod {
    public static void main(String[] args) {
        // replace method of String
        // it will go  through all part of String and replace
        //any match with new String
        // replace is case sensitive

        String message = "I love Pumpkin, Pumpkin is FUN!";
        message=message.replace("Pumpkin","Java!");
        System.out.println(message);

        // what if i want to replace space from everywhere
        String message2 = "Happy Thanks Givig to ALL";
        // "Happy Thanks Givig to ALL"---->> "Happy Thanksgiving to ALL"

        message2=message2.replace("Thanks Giving ", " Thanksgiving");
        System.out.println(message2);
        message2=message2.replace("!!", "!");
        System.out.println(message2);

        // remove all space
        message2=message.replace(" ", "");
        System.out.println("message2 = " + message2);

        String message3= "TOMORROW IS OFF NO!";
        message3= message3.replace("NO!", "");
        System.out.println(message3);
    }
}
