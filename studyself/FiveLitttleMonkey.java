package studyself;

import java.util.Scanner;

public class FiveLitttleMonkey {
    public static void main(String[] args) {
        int monkeyCount=5;
        String song = " little monkeys jumping on the bed\nOne fell off and bumped his head\nMama called the doctor said\nNo more monkeys jumping on the bed";
        String songEnd="Put those monkeys right to bed";
        while (monkeyCount>1) {
            if(monkeyCount %2 !=0){
                System.out.println(monkeyCount+song);
                --monkeyCount;

            }
            else if(monkeyCount %2 ==0){
                System.out.println(monkeyCount+song.replace("his", "her"));
                --monkeyCount;
            }
        }
        System.out.println(monkeyCount+song.replace("No more monkeys jumping on the bed", songEnd));
    }

}

