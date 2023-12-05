package day14;

public class StringReview {
    public static void main(String[] args) {
        String str= "I like Pumpkin";
        System.out.println("str = " + str);

        // contains:
        // it checks whether a string exist is another string
        // and return true or false result
        System.out.println("Does it contains Pumpkin:");
        System.out.println(str.contains("Pumpkin"));

        boolean gotPumpkin = str.contains("Pumpkin");
        // shortcut to print variable value in nice format soutv + tab
        System.out.println("gotPumpkin = " + gotPumpkin);
        //startsWith endsWith
        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);
        // Password VALIDATOR
        // MINIMUM 8 CHAR MAX 16 CHAR
        // IT MUST CONTAINS _ OR $
        // IT MUST NOT CONTAINS SPACE
        // IT MUST START Ab
        // if any of above condition dos not matc say iNVALID PASSWORD
        //else say GOOD PASSWORD!
        // MINIMUM 8 CHAR MAX 16 CHAR
        //password.length()  >=8 && password.length() <=16
        // it MUST CONTAINS _ OR $
        // password.contains("_") || password.contains("$")
        // IT MUST NOT CONTAINS SPACE
        // ! password.contains(" " )
        // IT MUST START ab
        // password.starWith("Ab")





    }

}
