package ShortVideosCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class CollectionInterfaceMethos {
    public static void main(String[] args) {
        // common Collection interface methods
        Collection<Integer> coll = new ArrayList<>();

        // adding items
        coll.add(3);
        coll.add(30);
        coll.add(13);
        System.out.println("coll = " + coll); //coll = [3, 30, 13]

        // adding multiple items one shot
        coll.addAll(Arrays.asList(3,4,6,7,8,9,0));
        System.out.println(coll); // [3, 30, 13, 3, 4, 6, 7, 8, 9, 0]
        
        // getting size
        System.out.println("coll.size() = " + coll.size()); //coll.size() = 10

        // checking empty or not
        System.out.println("coll.isEmpty() = " + coll.isEmpty()); // coll.isEmpty() = false

        // remove item
        System.out.println("coll = " + coll.remove(7)); //coll = true

        coll.remove(7);
        System.out.println( coll); //[3, 30, 13, 3, 4, 6, 8, 9, 0]

        // contain item
        coll.contains(7);
        System.out.println( coll); //[3, 30, 13, 3, 4, 6, 8, 9, 0]

        System.out.println("coll.contains(7) = " + coll.contains(7)); // coll.contains(7) = false

        // contains All items
        System.out.println(" coll.containsAll(Arrays.asList(3,4,6)= " + coll.containsAll(Arrays.asList(3,4,6))); // true

        coll.containsAll(Arrays.asList(3,4,6));
        System.out.println(coll);// [3, 30, 13, 3, 4, 6, 8, 9, 0]

        // remove All
        coll.removeAll(Arrays.asList(3,4,6));
        System.out.println("coll = " + coll); // coll = [30, 13, 8, 9, 0]

        System.out.println(coll.removeAll(Arrays.asList(3,4,6))); // false

        // retain All
        coll.retainAll(Arrays.asList(30,40,9));
        System.out.println(coll); // [30, 9]

        System.out.println(coll.retainAll(Arrays.asList(30,40,9))); // false

        // removeIf
        coll.removeIf(each -> each>10);
        System.out.println( coll); //[9]

        // Turning into array
        Integer[] inArray = coll.toArray(new Integer[4]);
        System.out.println(Arrays.toString(inArray)); // [9, null, null, null]

    }
}
