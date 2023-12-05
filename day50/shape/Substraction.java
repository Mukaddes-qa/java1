package day50.shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Substraction extends Question {

    public Substraction(int num1, int num2) {
        super("Subtraction question", "-");
//        this.num1 = num1 ;
////        this.num2 = num2 ;
        // need to make sure num1 is always more than num2
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // after making sure num1 is more than num2 then we set the field value
        this.num1 = num1;
        this.num2 = num2;

    }

    @Override
    public void calculate() {
        answer = num1 - num2;
        // calculated is the instance field to keep track of the Question
        // is calculated or not
        calculated = true;
    }

    @Override
    public String toString() {

        // how do I call toString method of super class so i can generate
        // something like this :
        // // The question type is Addition :  10+90 =
        if (calculated == true) {
            return super.toString() + num1 + operator + num2 + " = " + answer;
        } else {
            return super.toString() + num1 + operator + num2 + " = ";
        }

    }


    public static class Practice {


        public static void main(String[] args) {


            List<String> lst = new ArrayList<>();
            lst.add("Abc");


            List<Integer> lst2 = new ArrayList<>();
            lst2.add(12);
            lst2.add(10);
            lst2.add(11);
            lst2.add(1);
            lst2.add(100);

            Collections.sort(lst2);
            System.out.println("lst2 = " + lst2);


        }


    }
}