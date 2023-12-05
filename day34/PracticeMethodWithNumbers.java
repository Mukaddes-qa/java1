package day34;

public class PracticeMethodWithNumbers {
    public static void main(String[] args) {
        System.out.println(build3DigitNumber(6,14,0)); // 600
        System.out.println(build3DigitNumber(6,4,0)); // 640
        System.out.println(build3DigitNumber(16,14,90)); // 0
    }
    public static int build3DigitNumber(int digit1, int digit2, int digit3){

      if(digit1<0 || digit1>9 ){
          digit1=0;
      }
      if(digit2<0 || digit2>9){
          digit2=0;
      }
        if(digit3<0 || digit3>9){
            digit3=0;
        }
        int number = (digit1*100)+(digit2*10)+digit3;
        return number;
    }
}
