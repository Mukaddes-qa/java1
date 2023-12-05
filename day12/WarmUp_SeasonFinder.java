package day12;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {
        int month = 1;
        if (month<1 || month>12){
            System.out.println("INVALID MONTH");
        }else if (month>=3 && month<=5){
            System.out.println("IT'S SPRING!");
        }else if (month>=6 && month<=8){
            System.out.println("IT'S SUMMER!");
        }else if (month>=9 && month<=11){
            System.out.println("IT'S FALL");
        }else if ( month==12 || month==1 || month==2){
            System.out.println("IT'S WINTER");
        }
    }
}
