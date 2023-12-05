package Task;

import java.util.Scanner;

public class selfff {
    public static void main(String[] args) {



        }
    public int countHi(String str) {
        int len = str.length()-1;
        int count=0;

        for(int i=0; i<len; i++){
            if(str.charAt(i)=='h' && str.charAt(i+1)=='i'){
                count+=1;
            }
        }
        return count;
    }

}
