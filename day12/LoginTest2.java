package day12;

public class LoginTest2 {
    public static void main(String[] args) {
       /* String userName= "Mukaddes";
       boolean userNameCorrect= userName.equals("Mukaddes");
        System.out.println(userNameCorrect);
        boolean nameCheckIgnoreCase=userName.equalsIgnoreCase("MUKADDES");
        System.out.println(nameCheckIgnoreCase);*/

       String name = "Emre";
       // i want to store the result of checking name into a variable
        boolean nameEqualsWithoutCase=name.equalsIgnoreCase("emre");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println(nameEqualsWithoutCase);

        System.out.println(name.equalsIgnoreCase("eMre"));

    }
}
