package day15;

public class StringCaseIntensiveCheck {
    public static void main(String[] args) {
        String name= "Arya Stark";
        System.out.println("name.contains st RESULT IS : " + name.contains("st") );
        // Iwanna check whether this name contains st no matter the case
        // so I want to store the uppercase version of this name then check for St
         String upperCaseName= name.toUpperCase();
        System.out.println("UpperCaseName contains ST or not? " + upperCaseName.contains("ST"));
        String lowerCaeName=name.toLowerCase();
        System.out.println("lowerCaseName contains st or not ? " + lowerCaeName.contains("st"));
      // This is called method chaining, combining multiple merhod call
        //make my name all lowerCase then check whether it contains lowerCase st
        System.out.println(name.toLowerCase().contains("st")); // String string (because this is work)
        //System.out.println(name.length().toUppercase()); // int String(because this is not work
    }
}
