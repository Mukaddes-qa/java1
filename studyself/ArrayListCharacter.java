package studyself;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCharacter {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("UnitedStates");
        names.add("Europe");
        names.add("Turkey");
        names.add("m");
        names.add("Asia");
        System.out.println("Names " + names);
        characterNames(names);



    }
    public static void characterNames (List<String> names){
        for (int i = 0; i <names.size() ; i++) {
            if(names.get(i).length()<2){
                names.remove(i);
            }
            if(names.get(i).length()<10){
                names.set(i,names.get(i).substring(0,10));
            }
            if(names.get(i).length()==5){
                String reverse ="";
                for (int j =names.get(i).length()-1; j>=0 ; j--) {
                    reverse+=names.get(i).charAt(j);
                }
                names.set(i,reverse);
            }
        }
        System.out.println("After :" + names);
    }
}
