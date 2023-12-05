package day20;

import java.util.*;

public class PalindromeTest {
    // if you reverse a String it does change it means
    // the Spring is called palindrome
    public static void main(String[] args) {
        // level , kayak, elle , madam, aziza
        String name= "kayak";
        System.out.println("name = " + name);
        String reversedName="";

        for (int x = name.length()-1; x >=0 ; x--) {
            reversedName=reversedName +name.charAt(x);

        }
        System.out.println("reversedName = " + reversedName);
        // Check whether reversed name is equal without case checking
        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test has passed");
        }else{
            System.out.println("Palindrome test has pailed");
        }
        int[] arr=new int[10];
        String[] books={"a","b","c","c"};
        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(books));
        for(String s: list){
            System.out.println(s);
        }

        //FREQUENCY --> with MAP

        // reference type is LinkedHashMap we create object from Map
        //LinkedHashMap --> keeps order
        // map contains key and value --> String=key ,Integer=value

        String word="AABBCCDDE";
        Map<Character, Integer> map=new LinkedHashMap<>();

        for(int i=0; i<word.length(); i++){
            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),1);
            }else{
                map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }
            Set<Integer> set=new HashSet<>();

        }
        // now we iterate with for each loop
        for(Map.Entry a : map.entrySet() ){
            System.out.println("Word contains "+a.getValue()+" times"+a.getKey()+" character");
        }








    }
}
