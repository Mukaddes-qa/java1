package Office_hours;

public class Practice_Monday_12_02_2 {
    public static void main(String[] args) {
        //             01234567890
        String name = "Zehra Aygun";
        // getting each chracter using charAt(index)
        // generate sequantial number 0--->>10;
        //is there any chance that while loop does not execute
        int x = 0;
        while (x<name.length()){
            //System.out.println(name.charAt(x)); // Z
            System.out.println("index: " + x);
            System.out.println(name.charAt(x));
            ++x;
        }
    }
}
