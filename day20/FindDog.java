package day20;

import java.security.spec.RSAOtherPrimeInfo;

public class FindDog {
    public static void main(String[] args) {
          //          0123456789012345678901234567890123456789012345
        String msg = "I like Dog , Dogs are cute , Dogs are friendy";

       int lastCharIndex=msg.length()-1;
        for (int i = 0; i <= lastCharIndex-2 ; i++) {
            String current3chars=msg.substring(i, i+3);

        if(current3chars.equals("Dog")){
            System.out.println("BINGO !!! AT " + i);

        }


    }
}}
