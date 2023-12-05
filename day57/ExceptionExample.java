package day57;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Hello B15 Online OnCampus Friends");
      //  int num=2.5; // this compile error
        int[] nums = new int[3]; // 0,1,2
        nums[0]= 55;
        nums[1]= 56;
        nums[2] = 100;
        nums[10]= 200; // ArratIndexOutOfBoundsException is thrown here

        int result = 10/0;
        System.out.println("result is = " + result);

        System.out.println("Bye Bye B15 Online Friends!");
    }
}
