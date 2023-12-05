package day36;

public class MethodPractice {
    public static void main(String[] args) {
        Boolean result1= checkIfStatementHasNumber("yzt13ck");
        System.out.println("result1 = " + result1);

        System.out.println(checkIfStatementHasNumber("a s334f"));
    }
    public static Boolean checkIfStatementHasNumber(String str){
        for (int i = 0; i <str.length() ; i++) {
            char eachChar = str.charAt(i);
            if(Character.isDigit((eachChar))){
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
  }
}
