package day34;

public class LoginActivity {
    public static void main(String[] args) {
        //2, login2 :  static method boolean return type
        //	it has two String method paramters
        //			called username and password
        //	(it accept 2 String object as argument when being called)
        //	it check whther username and password  "user" and "abc123"
        //	if yes
        //		return true
        //	else
        //		return false
        LoginActivity2("user","abc123");
        System.out.println(LoginActivity("user","abc"));
    }
    public static  boolean LoginActivity (String username, String password){
        if(username.equals("user") && password.equals("abc123")) {
           return true;
        } else {
            return false;
         }
        }
        public static void LoginActivity2 (String username, String password) {
            if (username.equals("user") && password.equals("abc123")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Failed");
                ;
            }
        }
}
