package Office_hours;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> numLst = Arrays.asList("79","54","100", "65", "44", "48", "78", "68","44","78","99","77");
        System.out.println("numLst = " + numLst);

        for (String each :numLst) {

            int eachNum = Integer.parseInt(each);
            if(eachNum>60){
                System.out.println("Pass = " + eachNum);
            }else{
                System.out.println("Fail = " +eachNum);
            }
        }
        int count=0;
        for(String each : numLst){
            if(Integer.parseInt(each)>90){
                ++count;
            }
        }
        System.out.println("count = " + count);
        
        int sum=0;
        for(String each : numLst){
            sum=sum + Integer.parseInt(each);
        }
        System.out.println("sum = " + sum);
        System.out.println("Average = " + sum/ numLst.size());
    }
}
