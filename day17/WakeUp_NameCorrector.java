package day17;

public class WakeUp_NameCorrector {
    public static void main(String[] args) {
        String name = "mUkAdDes";
        System.out.println("name : "+ name);

        String name2 = name.toLowerCase().replace("m", "M");
        System.out.println("name2 : " + name2);

        String name3 = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("name3 : " + name3);

        String name4 = (name.charAt(0)+ "").toLowerCase() + name.substring(1).toUpperCase();
        System.out.println("name4 : " +name4);

        String fullName = "mUKAddes KayGuSuz";
        String firstName= fullName.substring(0,8);

        System.out.println(firstName);
        String lastName = fullName.substring(9);

        System.out.println(lastName);
        String firstNameCorrected = firstName.toUpperCase().substring(0,1)+ firstName.substring(1).toLowerCase();
        System.out.println("firstNameCorrected = " + firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0,1) + lastName.substring(1).toUpperCase();
        System.out.println("lastNameCorrected = " + lastNameCorrected);

        System.out.println("Full name : " + firstNameCorrected + " " + lastNameCorrected);
        int indexOfSpace =fullName.indexOf(" ");


        System.out.println("indexOfSpace = " + indexOfSpace);

    }
}
