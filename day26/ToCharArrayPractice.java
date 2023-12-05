package day26;

public class ToCharArrayPractice {
    public static void main(String[] args) {
        // 2 additional String String methods related to array
        // toCharArray(), another is split(bySomething)

        String survey = "Complete B15 Online 1 month Survey";
        char[] surveyChars = survey.toCharArray();

        // how did Determine to use char for each??
        // because each item in char array is char
        //1.way
        for (char each :surveyChars) {
            System.out.println("Each char is : " + each);
        }
        //2.way using for loop
        for (int x = 0; x <surveyChars.length ; x++) {
            System.out.println("Each char is : " + surveyChars[x]);
        }
         //3.way just for fun why dont we try while loop
        int x=0;
        while(x< surveyChars.length){
            System.out.println("Each char is : " + surveyChars[x]);
            x++;
        }
        //4.way for fun do while
        int y=0;
        do{
            System.out.println(surveyChars[y]);
            y++;
        }while(y<surveyChars.length);
    }
}
