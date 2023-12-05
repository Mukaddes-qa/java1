package studyself;

public class SumExtractNumbersFromMethod {
    public static void main(String[] args) {
        String str = "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF";

        char[] allChars = str.toCharArray();
        int sum = 0;
        for(char each : allChars){
            if(Character.isDigit(each)){
                System.out.println("each = " + each);

                int eachNum = Integer.parseInt(each + "");
                sum = sum + eachNum;

            }
        }
        System.out.println("sum = " + sum);
    }
}
