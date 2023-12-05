package day56;

public class Singleton {

    private Singleton(){
        System.out.println("no arg");
    }
    public static Singleton getInstance(){
        return  new Singleton();
    }
}
