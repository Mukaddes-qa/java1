package day29;

public class HeroIdentity2 {
    public static void main(String[] args) {
        // split it by - to get the code and full name
        // get the length of full name
        // generate stars with same length as full name character count
        // concatenate herocode with dash and stars and save it
        //  one the star is generated , replace full name with Stars
        String hero1 = "Superman-Clark J Kent";
        String[] heroSplitted = hero1.split("-");
        String heroCode=heroSplitted[0];
        String fullName=heroSplitted[1];

        String stars= "";
        for (int i = 0; i <fullName.length() ; i++) {
            stars+="*";
        }
        System.out.println("stars = " + stars);

        String  heroX= hero1.replace(fullName,stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);

    }
}
