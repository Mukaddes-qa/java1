package Office_hours;

public class Practice_Monday_12_02 {
    public static void main(String[] args) {
                   //012345678901234567890123456
        String item="Echo Dot (5th generation) Charcoal";
        //get whatever is inside parenthesis()
        //find out indecOf (and index of ) use them for substring to get the text
        System.out.println(item.substring(9,18));
        System.out.println(item.substring(10,17));
        
        int indexOfOpeningParenthesis = item.indexOf("(");
        int indexOfEndOfParenthesis = item.indexOf(")");
        
        String  wordInsideParenthesis = item.substring((indexOfOpeningParenthesis)+1,
                indexOfEndOfParenthesis); // +1 because we need letter first letter in ()
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);

        String letters = "J%a^V**$a(";
        System.out.println("letters before = " + letters);
        //remove  % ^ * $
        letters=letters.replace("%", "")
                       .replace("^","")
                       .replace("*","")
                        .replace("$","")
                        .toUpperCase();

        System.out.println("letters = " + letters);
        

    }
}
