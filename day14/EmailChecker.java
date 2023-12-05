package day14;

import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = scan.nextLine();

        if (!email.contains("@") || email.contains(" ")) {
            System.out.println("INVALID EMAIL");
        } else if (email.endsWith("@yahoo.com")) {
            System.out.println("@yahoo.mail");
        } else if (email.endsWith("@mail.ru")) {
            System.out.println("russian email");
        } else  if (email.endsWith("@gmail.com")) {
            System.out.println();

            }

        }
    }
