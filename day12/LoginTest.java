package day12;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        String userName ="user123";
        String password= "pass123";

      /*  if(userName.equals("user123") ){
            System.out.println("Print login is succesfull!");
        }else{
            System.out.println("Username is not correct");
        }if (password.equals("pass123")){
            System.out.println("Print password is succesfull");
        }else{
            System.out.println("Password is not correct");
        }
*/
        if(userName.equals("user123") && password.equals("pass123") ){
            System.out.println("Login is succesfull!");
        }else if(! userName.equals("user123") && password.equals("pass123")){
            System.out.println("USERNAME IS NOT CORRECT ! ! ! ");
        }else if (userName.equals("user123") && password.equals("pass123")){
            System.out.println("PASSWORD IS NOT CORRECT ! ! ! ");
        }else{
            System.out.println("USERNAME AND PASSWORD ARE BOTH WRONG ! ! ! ");
        }

    }
}
