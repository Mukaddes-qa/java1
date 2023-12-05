package day31;

public class CalllingOneMethodINsideAnother {
    public static void main(String[] args) {
        finallyAwake();

    }
    public static void finallyAwake(){
        wakeUp();
        drinkCoffee();

    }
        public static void wakeUp(){

            System.out.println("Open your eye , only one");
            System.out.println("Close your eye");
            System.out.println("Head your a;arm? open it again!");
            System.out.println("-----------------------");
        }
        public static void drinkCoffee(){
            System.out.println("Put coffee in your machine ");
            System.out.println("Make your coffee");
            System.out.println("---------------------");
        }

    }
