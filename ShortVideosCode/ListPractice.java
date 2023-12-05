package ShortVideosCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {

        // Common List methods / on top of methods from Collection interface

        List<Double> lst = new LinkedList<>(Arrays.asList(3d,4d,27d,66d,3d,3d,44d));
        System.out.println(lst); // [3.0, 4.0, 27.0, 66.0, 3.0, 3.0, 44.0]

        // accessing items using index
        System.out.println("first item = " + lst.get(0)); // first item = 3.0

        // adding items in certain index
        lst.add(1,5d);
        System.out.println(lst); // [3.0, 5.0, 4.0, 27.0, 66.0, 3.0, 3.0, 44.0]

        // updating items in certain index
        lst.set(0, 99.0);
        System.out.println(lst); //[99.0, 5.0, 4.0, 27.0, 66.0, 3.0, 3.0, 44.0]

        // getting indexes of certain items
        System.out.println(" index of 4.0 = " + lst.indexOf(4.0)); //index of 4.0 = 2
        System.out.println(" index of 3.0 = " + lst.indexOf(3.0)); //index of 3.0 = 5
        System.out.println("last index of  "+lst.lastIndexOf(3.0)); // 6
        System.out.println("if item not found : " + lst.indexOf(100.0)); // -1


    }
}
