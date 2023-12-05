package day13;

public class TestStringStartWithOrEnd {
    public static void main(String[] args) {
        String name = "Muge";
        // check if a String start with another string
        // IT IS CASE SENSITIVE
        System.out.println(name.startsWith("Mu"));
        System.out.println(name.startsWith("Mac"));
        System.out.println(name.startsWith("mu"));
        // check if a String start with another string
        System.out.println(name.endsWith("ge"));
        System.out.println(name.endsWith("mu"));
        System.out.println(name.endsWith("M"));

    }
}
