package day06;

public class CompoundOperator2 {
    public static void main(String[] args) {

        // Assignment Operator =
        // --> will save the result of whatever operation on the right side
        // and assign the result to the left side variable;
        // += , -== , *== , /=, %=
        //it can simplfy the operation if you have same variable
        // on both side of the assigment

        int studentOnline = 263;

       // studentOnline = studentOnline + 5;
        studentOnline += 5;
        System.out.println("5 people joined the class " + studentOnline);
        // studentOnline = studentOnline - 3;
        studentOnline -= 3;
        System.out.println("3 people left the class " + studentOnline);

       // studentOnline = studentOnline * 2;
        studentOnline *=2;
        System.out.println("The student come double " + studentOnline);

        //studentOnline = studentOnline / 3;
        studentOnline /=3;
        System.out.println("The student dropped to 1/3 " + studentOnline);
    }
}

