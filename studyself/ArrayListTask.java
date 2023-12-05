package studyself;

import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {
        /*Task1
   Given a ArrayList of 6 Integer 1,3,7,2,12,7
insert 100 in between each numbers
For example :
1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7
Optionally make it a method
write a static void method that accept a ArrayList of integer
 object and insert 100 in between items. */
        ArrayList<Integer> addNum=new ArrayList<>();
        addNum.add(1);
        addNum.add(3);
        addNum.add(7);
        addNum.add(2);
        addNum.add(12);
        addNum.add(7);
        add100BeetweenNum(addNum);
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(3);
        num.add(7);
        num.add(2);
        num.add(12);
        num.add(7);
        for (int i = 0; i < num.size(); i++) {
            if (i % 2 != 0) {
                num.add(i, 100);
            }
        }
        System.out.println(num);
    }
    public static void add100BeetweenNum (ArrayList<Integer>num){
        for (int i = 0; i <num.size() ; i++) {
            if(i%2==0){
                num.add(i,100);
            }
        }
        System.out.println(num);
    }

}

