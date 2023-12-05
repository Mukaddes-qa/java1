package day42;

public class MovieAction {
    public static void main(String[] args) {
        Movie m1=new Movie();
        System.out.println("m1 = " + m1);

        Movie m2= new Movie("Joker", 2.2,"Drama");
        System.out.println("m2 = " + m2);
        Movie m3 = new Movie("Frozen",1.5, "Family");
        System.out.println("m3 = " + m3);
        Movie m4= new Movie ("Pursuit of Happiness ", 2.0, "Drama");
        System.out.println("m4 = " + m4);
        //I WANT TO GET THE LENGTH OF M2 SEPARATELY  SO I CAN DO SOME
        System.out.println(m2.getName());
    }
}
