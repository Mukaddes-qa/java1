package Static;

public class StaticMethod {

        int multiply(int a, int b){
            return a * b;
        }
        static int add(int a, int b){
            return a + b;
        }

        public static void main( String[] args ) {
            StaticMethod st = new StaticMethod();
            // calling a nonstatic member function
            System.out.println(" 2 * 2 = " + st.multiply(2,2));
            // calling a static member function
            System.out.println(" 2 + 3 = " + StaticMethod.add(2,3));
        }
    }

    