package studyself;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ArrayListInsertBetweenNumbers {
    public static void main(String[] args) {

        System.out.println("----WithMethod----");
        ArrayList<Integer> insertNum=new ArrayList<>();
        insertNum.add(1);
        insertNum.add(3);
        insertNum.add(7);
        insertNum.add(2);
        insertNum.add(12);
        insertNum.add(7);
        addNumBetween(insertNum);

        System.out.println("-----Without Method-----");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(3);
        num.add(7);
        num.add(2);
        num.add(12);
        num.add(7);

        for (int i = 1; i < num.size(); i+=2) {
                num.add(i, 100);

        }
        System.out.println(num);
    }

    public static void addNumBetween (ArrayList<Integer>num){

        for (int i = 0; i <num.size() ; i++) {
            if (i % 2 != 0) {
                num.add(i, 100);
            }
        }
        System.out.println(num);
    }
}
