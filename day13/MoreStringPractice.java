package day13;


public class MoreStringPractice {
    public static void main(String[] args) {
        String name = "Pumkin";
        System.out.println(name);
        name="Cat";
        System.out.println(name);
        // String is immutable , once created It can not be changed
        // any String actions / methods that looks like changing the value
        // actually creating a new string object
        name.toUpperCase();
        System.out.println(name); // Cat
        System.out.println(name.toUpperCase()); // CAT

        // WHAT IF I REAALY WANT TO CHANGE THE NAME
        name= name.toUpperCase();
        System.out.println(name); // just live this
    }

    
}
