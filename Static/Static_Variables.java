package Static;

public class Static_Variables {

    static int num1= 10; // static variable // with initilazition
    int num2 = 5; // non static variable

    public static void main(String[] args) {
        Static_Variables x = new Static_Variables();
        System.out.println(x.num2 );

        System.out.println(num1);
    }
}

