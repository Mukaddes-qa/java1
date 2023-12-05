package Static;

public class StaticBlock {
    static int A = 3;
    static int B;
    static int MAX;

    static {
        System.out.println("First Static block.");
        B = A * 4;
    }

    static {
        System.out.println("Second Static block.");
        MAX = 10;
    }

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("MAX = " + MAX);
    }

    public static void main(String args[]) {
        meth(42);
    }
}
