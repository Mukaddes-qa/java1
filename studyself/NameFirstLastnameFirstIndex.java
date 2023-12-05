package studyself;

public class NameFirstLastnameFirstIndex {
    public static void main(String[] args) {
        String name= "Mukaddes Kaygusuz";
        int lastNameInitialIndex = name.indexOf(" ") +1 ;
        String fullName = name.charAt(0) +  " " + name.charAt(lastNameInitialIndex);
        System.out.println(fullName);
    }
}
