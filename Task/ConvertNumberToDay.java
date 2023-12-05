package Task;

public class ConvertNumberToDay {
    public static void main(String[] args) {
        int[] allCodes = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int each:allCodes){
            System.out.println("Day " + each + " is : " + covertNumberToDay(each));
        }
    }
    public static String  covertNumberToDay (int dayCode) {
        switch (dayCode) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";

            default:
                return "FUNDAY!!";

        }
    }

}
