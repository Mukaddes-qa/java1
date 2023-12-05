package studyself;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRemoveAllAddAllBulk {
    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9) ) ;
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(2,4,5,6,7,8,9,12,17,19)) ;
        System.out.println("numbers1 = " + numbers1);
        System.out.println("numbers2 = " + numbers2);

        //addAll
        numbers2.addAll(numbers1);
        System.out.println("numbers1+numbers2 = " + numbers2);

        //addAll without duplicate
        for (int i = 0; i < numbers2.size() ; i++) {
            if(!numbers1.contains(numbers2.get(i))){
                numbers1.add(numbers2.get(i));
            }
        }
        System.out.println(numbers1);

        //removeAll
        for (int i = 0; i <numbers2.size() ; i++) {
             if(numbers1.contains(numbers2.get(i))){
                 numbers2.removeAll((Arrays.asList(numbers2.get(i))));
                 i--;
             }
        }
        numbers1.addAll(numbers2);
        System.out.println("numbers2 = " + numbers2);
        System.out.println("numbers1 = " + numbers1);

    }
}
