package day33;

public class NumberActions {
    public static void main(String[] args) {
        System.out.println(getSumFrom1toX(10));
        System.out.println(build_GOT_Email("John","Snow"));
    }
    public static int getSumFrom1toX (int x){
        int sum=0;
        for (int i = 1; i <x ; i++) {
                  sum+=i;
        }
        return sum;
    }
    /**
     * build_GOT_Email
     * This method should build email using user's first and last name
     * for example Jon Snow --->> JSnow@NightWatch.com
     * @param firstName user's first name
     * @param lastName  user's last name
     * @return the email created using
     * firstName initial+lastname+@NightWatch.com
     */
    public static String build_GOT_Email(String firstName, String lastName){
        String email = firstName.charAt(0)+lastName+"@NightWatch.com";
        return email;
    }

}
