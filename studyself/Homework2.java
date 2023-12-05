package studyself;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        // Create a program to
        // ask user two number and
        // add numbers within those range
        Scanner scan = new Scanner((System.in));
        System.out.println("Enter two numbers: ");

      int one = scan.nextInt();
      int second=scan.nextInt();
        for (int i = one; i <= second; i++) {
            System.out.print(i+ ",");
        }
    }
}

