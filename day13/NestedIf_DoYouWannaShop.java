package day13;


public class NestedIf_DoYouWannaShop {
    public static void main(String[] args) {
        boolean youWantToShop = true;
        String reference = "Store";
        // if(youWantToShop==true){
        if (reference.equalsIgnoreCase("Store")) {
            System.out.println("Going to store for shopping!!!");
        } else {
            System.out.println("Going to online for shopping!!!");
        }
    }
}
