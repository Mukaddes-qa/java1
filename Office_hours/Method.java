package Office_hours;

public class Method {
    public static void main(String[] args) {
        // method its just a reusable piece of code
        //with return type and without (void)
        //method can be with parameter/s or without

        String word = "computer";
        System.out.println(reverseString(word));

    }
    public static String reverseString(String str){
        String reversedString="";
        for (int i = str.length()-1; i>=0; i--) {
            reversedString+=str.charAt(i);
        }
        return reversedString;
    }
}
