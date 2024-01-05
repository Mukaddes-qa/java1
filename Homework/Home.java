package com.automation.Homework;

public class Home {
    public static void main(String[] args) {
        int number = 5; // user-defined input to find factorial
        long fact = 1; // defining fact=1 since least value is 1
        int i = 1;

        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" = "+fact);
    }
}

   /* public static int main(String[] args) {
        int n =10;
        int count = 0;
        long result = 1;

        for (int k = n; k > 0; k--) {
            for (int i = 1; i < k; i++) {
                result *= i;

            }
            if (result % k == k - 1) {
                count++;

            }
            result = 1;
        }
        return count;
    }

    public static void main(String[] args)
    }
}*/






















