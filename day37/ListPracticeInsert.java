package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeInsert {
    public static void main(String[] args) {
        //add --> insert item    : cutting into the line when paying for items
        //   --- everyone after that person get angry
        //   because their index shifted and need to wait longer
        //set -->  replace item : replacing the child
        // who is waiting in line for you to pay after shopping
        //  --- everyone is ok with it because person waiting inline changed
        //  but index is not shifted
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :

       System.out.println("lst2 = " + lst2);
       int locationOf34Value =lst2.indexOf(34);

        lst2.add(lst2.indexOf(34) +1 , 100);
        System.out.println("lst2 = " + lst2);

        for (int i = 0; i <5 ; i++) {
            lst2.add(0,100);
        }
        System.out.println("lst2 = " + lst2);
    }
}
