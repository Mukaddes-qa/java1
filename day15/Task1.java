package day15;

public class Task1 {
    public static void main(String[] args) {
        String name = "Mukaddes";

        if(name.length()<=4){
            System.out.println("short name");
        }else if (name.length()>=5 && name.length()<=10){
            System.out.println("Medium name");
        }else if(name.length()<=10){
            System.out.println("Longer name");
        }
        System.out.println("------------------------");

        if(name.contains("a") || name.contains("e")){
            System.out.println("Name contains a or e");
        }else{
            System.out.println("I don't have both a or e in my name!");
        }


        for(int nameReverse = name.length()-1; nameReverse >=0; nameReverse--){
            System.out.println("My name reverse is " + name.charAt(nameReverse));
        }


        // farkli sekilde
        int lengthOfTheName= name.length();
        System.out.println("Length Of The Name = " +lengthOfTheName);
        if(lengthOfTheName<4) {
            System.out.println("Short name");
            //}else if (lengthOfTheName>=4 && lengthOfTheName<=11){
        }else if (lengthOfTheName<=11){
            System.out.println("Medium Name");
        }else{
            System.out.println("Longer name");
        }


    }
}
