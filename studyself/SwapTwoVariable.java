package studyself;

public class SwapTwoVariable {
    public static void main(String[] args) {
        //Swap two variable' values without using a temporary variable
        //        Ex:
        //            if a =10, b= 20;
        //                output: print( a ) ==> 20
        //                        print( b ) ==> 10
        int a, b, temp;
        a = 10;
        b = 20;
        System.out.println("Before swapping : " + "a:" + a + " b:" +b);
        temp = a; //temp=10
        a = b;// a=20
        b = temp;//b=10
        System.out.println("After swapping : " + "a:" + a + " b:" +b);
    }
}
