package day10;

public class MultiBranch_WithSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to MC DONALDS!");
        int itemNumber =35;
        String order ="";
        switch(itemNumber){
            case 11:
                System.out.println("You have selected 11");
            order="Burger";
            break;
            case 5:
                System.out.println("You have selected 5");
                order="French Fry";
                break;
            case 8:
                System.out.println("You have selected 8");
                order="Nuggets";
                break;
            case 35:
                System.out.println("You have selected 35");
                System.out.println("YAYY !!! YUM!");
                System.out.println("ENJOY");
                order = ("Ice cream");
                break;
            default:
                System.out.println("You have selected " + order);

        }
    }
}
