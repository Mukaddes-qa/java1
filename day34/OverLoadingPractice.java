package day34;

public class OverLoadingPractice {
    public static void main(String[] args) {
    overLoaded(15);
    overLoaded(15,45);
    overLoaded(15,43,67);
    overLoaded(15L ,23L);
    }
    public static void overLoaded(int number){
        System.out.println(number + 100); // 115
        overLoaded(number,100); // 115
    }
    public static void  overLoaded(int a, int b){
        System.out.println(a+b);
    }
    public static void overLoaded (int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void overLoaded (long a, long b ){
        System.out.println(a+b);
    }
}
