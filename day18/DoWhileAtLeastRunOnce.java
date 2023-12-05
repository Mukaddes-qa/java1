package day18;

public class DoWhileAtLeastRunOnce {
    public static void main(String[] args) {
        int x=1000;
        do{
            System.out.println("KEEP GOING");
        }while(x<5);
        System.out.println("THE END");

        while(x<5){
            System.out.println("KEEP GOING IN WHILE");
        }
    }
}
