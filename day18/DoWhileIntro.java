package day18;

public class DoWhileIntro {
    public static void main(String[] args) {
        // count from1 to 5;
    //    do{
      //      take some action here and repeat it
        //}while (some condition is tru);
        int x=1;
        do{
            System.out.println(x);
            ++x;
        }while (x<=5);
        System.out.println("-----------------------------");

        // count from 5 to 1
        int y =5;
        do{
            System.out.println(y);
            --y;
        }while(y>=0);
        /*
        while loop check the condtion first then enter the statement
        do while loop will take the action at least once then check the condition

        DO WHILE LOOP ALWAYS RUN AT LEAST ONE ITERATION
        * WHILE LOOP MIGHT NOT EVEN RUN !!
         */
    }
}
