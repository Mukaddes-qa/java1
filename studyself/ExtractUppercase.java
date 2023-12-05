package studyself;

public class ExtractUppercase {
    public static void main(String[] args) {
        String str = "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF";
        String upperCase = " ";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                System.out.println("str.charAt("+i+") = " + str.charAt(i));
                upperCase+=str.charAt(i);
            }
        }
        System.out.println("upperCase = " + upperCase);
    }
}
