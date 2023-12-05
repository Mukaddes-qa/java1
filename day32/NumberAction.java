package day32;

public class NumberAction {
    public static void main(String[] args) {
        numberComparision(99,32);
        numberComparision(12,38);
        numberComparision(30,30);
        repeater("Cybertek",15);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(32);
        countEvenBack(10,6);
    }
    public static void numberComparision(int num1,int num2){
        if(num1>num2){
            System.out.println("num1 is more than num2");
        }else if(num2>num1){
            System.out.println("num2 is more than num1");
        }else{
            System.out.println("They are equal");
        }
    }
    public static void repeater (String strToRepeat ,int count){
        for (int i = 1; i <=count ; i++) {
            System.out.print(strToRepeat + " ");
        }
        System.out.println();
        }
        public static void skipCountBy3From0to50(){

            for (int i = 0; i <=50; i+=3) {
                    System.out.print(i+ " ");
                }
            System.out.println();
            }

        public static void countDownByEvenNumberFrom50to0(){
            for (int i = 50; i >=0 ; i-=2){
                    System.out.print(i + " ");
                }
                System.out.println();
            }

        public static void print1toX(int x){
            for (int i = 1; i <=x ; i++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        public static void countEvenBack (int x,int y){
            for (int i = x; i >=y ; i--) {
                if(i%2==0){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
}
