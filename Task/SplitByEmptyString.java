package Task;

import Notes.Array;

import java.util.Arrays;

public class SplitByEmptyString {
    public static void main(String[] args) {
        String word = "Hello" ;
        String [] split= word.split("");
        System.out.println(Arrays.toString(split));

        String[] firstCharacter=word.split("");
        String[] secondCharacter=new String[3];
        String theRest="";
        for (int i = 0; i <word.length() ; i++) {
            if(i>2){
          secondCharacter[i]=firstCharacter[i];
            }else{
                theRest+=firstCharacter[i];
            }
        secondCharacter[2]=theRest;
            System.out.println(Arrays.toString(secondCharacter));
        }
    }
}
