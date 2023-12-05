package studyself;

public class ExtractNumbersFromMethod {
    public static void main(String[] args) {

        String str = "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF";

        String numInStr = "";
        for (int x = 0; x < str.length(); x++) {
            if (Character.isDigit(str.charAt(x))) {
                System.out.println("str.charAt(" + x + ") = " + str.charAt(x));
                numInStr += str.charAt(x);

            }

        }

        System.out.println("numsInStr = " + numInStr);

        Integer num = Integer.valueOf(numInStr);
        System.out.println("num = " + num);
    }


}
