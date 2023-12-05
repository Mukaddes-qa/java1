package day14;

public class PasswordValidator {
    public static void main(String[] args) {
        String password="AB_12321$12csa";
        boolean min8max16=password.length() >=8 && password.length()<=16;
        boolean mustContain_or_$ = password.contains("-" ) || password.contains("$");
        boolean mustNotContainsSpace = ! password.contains("");
        boolean mustStartsWithAb= password.startsWith("Ab");

        if(min8max16 && mustContain_or_$ && mustNotContainsSpace&& mustStartsWithAb){
            System.out.println("VALID PASSWORD");
        }else{
            System.out.println("INVALID PASSWORD");
        }


    }
}
