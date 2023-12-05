package day11;

public class LogicalOperators {
    public static void main(String[] args) {
        // Combining muktiple condition
        // in java there is no range check directly like math
        // for example
        // in math : int x = 70;
        //          60 < x <100   --> true <100
        // in JAVA    x > 60 && x <100
        //&& 2 ampersand & 1 ampersand    -->> Logical AND Operator
        // this is used to check both conditions are true at the same time

        // Think about login examples
        // only when your username is right and your password is right at the same time
        //then you will be able to login

        /* int x = 70  x > 60 && x <100; true
           int x = 10  x > 60 && x <100; false
           int x = 110  x > 60 && x <100; false
           int x = 99  x > 60 && x <100; true
        */
        // 2 pipe or \ 1 pipe is used for compling 2 conditions :Logical OR Operators
        // if you have 2 conditions to check
        // When willl this be true :As long as one side is true , whole result will be true
        // think about buying milk from 2 stores:
       // As long as you found the milk in one store , you got the milk than you get out

  // How do I type pile character on keyboard \ --->> shift

   /*           true     false
   int x =70;   x>10  || x<5 --->>true
                false    false
  int x =7;    x>10  || x<5 --->> false
               true     false
  int x =17;   x>10  || x<5 --->>  true
               false    true
   int x =-8;   x>10  || x<5 --->> true


    */
        System.out.println("TRUTH TABLE");
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("TRUTH TABLE");
        System.out.println("RESULT OF true && true is " + (true && true));
        System.out.println("RESULT OF false && true is " + (false && true));
        System.out.println("RESULT OF true && false is " + (true && false));
        System.out.println("RESULT OF false && false is " + (false && false));

        System.out.println("TRUTH TABLE");
        System.out.println("RESULT OF true || true is " + (true || true));
        System.out.println("RESULT OF false || true is " + (false || true));
        System.out.println("RESULT OF true || false is " + (true || true));
        System.out.println("RESULT OF false || false is " + (false || false));

        int num=45;
        System.out.println(("------num<10 || num>100-------"));
        System.out.println((num<10 && num>100));

        int x=55;


        System.out.println(x>100 || x<10);
        System.out.println(x>10 && x<60);

        // more than 2 conditions at the same time, 3 conditions

                                    //true || false ---->>true
        System.out.println(true || false || false);
                                 // true || false ----->>false
        System.out.println(true && true && false);

                         //false || false --> || true --->> true
        System.out.println(x==50  || x==51  ||  x==55);

        // check x is more than 50 and x is not 52 or x equal to57

        System.out.println(x>50 && x!= 51 || x==57);

        System.out.println(false || true && true);
    }
}
