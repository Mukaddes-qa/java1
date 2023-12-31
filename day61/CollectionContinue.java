package day61;

import java.util.*;


public class CollectionContinue {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,6,4,5,7,8));
        System.out.println("nums = " + nums);

        // can we use get method when we have collection as reference type?
        //no!! only reference type decide what WE CAN acces
        // i want to sort this collection
       List<Integer> nums2 = new ArrayList<>(Arrays.asList(10,7,4,11,67,8));
       Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);

        // I want to sort this List
        Collections.sort((ArrayList<Integer>) nums);
        System.out.println("nums = " + nums);

    }
}
