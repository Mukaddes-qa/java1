package day32;

public class StringActions {
    public static void main(String[] args) {
        reversePrintMyOwnName();
        stringWithDash();
        stringWithDashInBetween("arya");
        stringWithDashInBetween("Kagan");
        stringWithDashInBetween("Alp");
    }
    public static void reversePrintMyOwnName (){
        String name = "Mukaddes";
        for (int i =name.length()-1 ; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
    public static void stringWithDash(){
        String name = "Mukaddes";
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i));
            if(i !=name.length()-1){
                System.out.print("-");
            }
        }
    }
    public static void stringWithDashInBetween(String name){

        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i));
            if(i !=name.length()-1){
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
