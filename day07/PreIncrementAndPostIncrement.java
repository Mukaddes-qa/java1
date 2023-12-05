package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {
        int apple = 8;
        apple++ ; // incrementing by one
        System.out.println(apple); // printing the increased value
       //  System.out.println(++apple); // increasing the value and print the value

        System.out.println(apple++); // it is ready next time show up 10
        System.out.println(apple);

        int score = 50;
        System.out.println( ++score ); // 51
        System.out.println( score++ ); // 51 and ready to be 52 next time its show up
        System.out.println(score); // 52
        System.out.println( --score); // 51
        System.out.println(score--); // 51 still 51 ready to be 50 next time its show up
        System.out.println(score); // 50
    }
}
