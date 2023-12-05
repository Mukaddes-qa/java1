package studyself;

import java.util.Scanner;

public class HW5LittleMonkey {
    public static void main(String[] args) {
       /*Try it out using
        while loop | do while loop |  for loop
        in 3 different classes
​
        -------------------
                Lyrics
        5 little monkeys jumping on the bed
        One fell off and bumped his head
        Mama called the doctor
        And the doctor said
        No more monkeys jumping on the bed
​
        4 little monkeys jumping on the bed
        One fell off and bumped her head
        Mama called the doctor
        And the doctor said,
        No more monkeys jumping on the bed
​
        3 little monkeys jumping on the bed
        One fell off and bumped his head
        Mama called the doctor
        And the doctor said,
        No more monkeys jumping on the bed
​
        2 little monkeys jumping on the bed
        One fell off and bumped her head
        Mama called the doctor
        And the doctor said,
        No more monkeys jumping on the bed
​
        1 little monkey jumping on the bed
        One fell off and bumped his head
        Mama called the doctor
        And the doctor said,
        Put those monkeys right to bed
​
        ---- Consider this ----
        Legend of 5 little monkeys:
​
        Pay closer attention to the actual Lyrics
        There are 3 boy monkeys and 2 girl monkeys
        the order monkeys fall down is
        5 - boy - bumped *his* head
                - No more monkeys jumping on the bed
​
        4 - girl - bumped *her* head
                - No more monkeys jumping on the bed
​
        3 - boy - bumped *his* head
                - No more monkeys jumping on the bed
​
        2 - girl - bumped *her* head
                - No more monkeys jumping on the bed
​
        When there is only one monkey the Lyrics change
        1 little monkey(not monkeys)
        1 - boy - bumped *his* head
                - Put those monkeys right to bed  */


        Scanner scan = new Scanner(System.in);
        //int totalMonkeys = 5;

        for (int totalMonkeys=5; totalMonkeys >= 1; totalMonkeys--) {

            if (totalMonkeys % 2 != 0 && totalMonkeys!=1) {

                System.out.println(totalMonkeys + " little monkeys jumping on the bed,\n" +
                        "One fell down and bumped his head,\n" +
                        "Mama called the doctor and the doctor said,\n" +
                        "No more monkeys jumping on the bed!");
                //--totalMonkeys;

            }
            else if (totalMonkeys % 2 == 0 && totalMonkeys!=1) {

                System.out.println(totalMonkeys + " little monkeys jumping on the bed,\n" +
                        "One fell down and bumped her head,\n" +
                        "Mama called the doctor and the doctor said,\n" +
                        "No more monkeys jumping on the bed!");
                // --totalMonkeys;

            }
            else
            {
                System.out.println("1 little monkey jumping on the bed,\n" +
                        "One fell down and bumped his head,\n" +
                        "Mama called the doctor and the doctor said,\n" +
                        "Put those monkeys right to bed");
                //--totalMonkeys;


            }
        }
    }
}
