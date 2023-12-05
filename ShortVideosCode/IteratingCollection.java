package ShortVideosCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingCollection {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>(Arrays.asList(3,4,5,2,66,544,31));
        System.out.println(coll); // [3, 4, 5, 2, 66, 544, 31]

       /* for(Integer each: coll){
            System.out.println(each); // 3 4 5 2 66 544 31
            if(each>10){
                coll.remove(each);
            }
        } */  //  for each loop can not modify in collection object(remove item or update item)
        Iterator<Integer> myIter =coll.iterator();
        // hasNext() it wiil just check your whether have an item your next location
        System.out.println(myIter.hasNext()); // true

     //   // next();
      //  System.out.println(myIter.next()); // 3 first item
       // System.out.println(myIter.next()); // 4
       // System.out.println(myIter.next()); // 5
       // System.out.println(myIter.next()); // 2
      //  System.out.println(myIter.next()); // 66

        // remove()
       // myIter.remove();
      //  System.out.println(myIter.next());
     //   System.out.println(coll); // [3, 4, 5, 2, 544, 31]


        while(myIter.hasNext()){
            Integer each= myIter.next();
            System.out.print(each +"-"); // 3-4-5-2-544-31
            if(each>10){
                myIter.remove();
            }
        }
        System.out.println(myIter.hasNext()); // false
        System.out.println(coll); // [3, 4, 5, 2]
        // System.out.println(myIter); it gives hashCode


    }
}
