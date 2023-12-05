package MuhtarsVideos;

public class ConstructorMethod {

   // public ConstructorMethod(){
     //   System.out.println("Default constructor");
    //}
    public ConstructorMethod(int a){
        System.out.println("Constructor with argument: " + a); // First executed
           }

    public  ConstructorMethod(boolean a){ // this is overloading method

        //ConstructorMethod(9); constructor cannor be called  by constructor name in overloading constructor method;
        //System.out.println("constructor with argument of : " + a); the constructor call HAS to be the priority in the constructor
      this(9);  // this mean representing the constructor
        System.out.println("constructor with argument of : " + a);// second executed
    }

    public ConstructorMethod(double a){
        System.out.println("Constructor with argument: " + a); // First executed
       //  this(10.5) so constructor cannot call it self
    }


    public static void main(String[] args) {
       // ConstructorMethod  obj = new ConstructorMethod("Hello");
        // it gives us compile error because this constructor is not exist!

        // ConstructorMethod(); --> compile error

        ConstructorMethod obj2 = new ConstructorMethod(9);

        Method1();

        ConstructorMethod obj4 = new ConstructorMethod(true);

    }

    public  static void Method1(){ // it is regular method

    }
}
