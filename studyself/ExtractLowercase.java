package studyself;

public class ExtractLowercase {
    public static void main(String[] args) {
        String str = "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF";
        
        String lowerCase = " ";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLowerCase(str.charAt(i))){
                System.out.println("str.charAt("+i+") = " + str.charAt(i));
                lowerCase+=str.charAt(i);
            }
        }
        System.out.println("lowerCase = " + lowerCase);
    }
}
