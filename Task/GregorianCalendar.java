package Task;

public class GregorianCalendar {
    public static void main(String[] args) {
        int year=3200;
        System.out.println(isLeapYear(year));
    }
    public static boolean isLeapYear (int year){
        boolean checkYear=true;
        if(year%4==0 && year%400==0){
            checkYear=true;
        }else if( year%100!=0){
            checkYear=false;
        }
        return checkYear;
    }

}
