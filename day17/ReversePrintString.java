package day17;

public class ReversePrintString {
    public static void main(String[] args) {
        String myName= "Mukaddes";
        int y= myName.length()-1;
        while (y >=0){
            System.out.print("index " + y + " : " + myName.charAt(y));
            --y;
        }
    }
}
