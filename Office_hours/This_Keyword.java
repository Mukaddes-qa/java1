package Office_hours;
class Test{
    public Test(){ // this is constructor
     //   this(); constructor cannot call byself it gives compile error
        this("Sumeyye"); //this constructor call another constructor but another constructor is not calling
        System.out.println("hola");
    }
    public Test(String str){
        // this() this compile error because Test() constructor contain this constructor(this("Summeyye"))
        System.out.println(str);
    }
    public Test(int a){ // constructor can be overloaded
      //  Test(); constructor can not be called by their
       // System.out.println("hello");  constructor call first step this gives compile error
        this(); // first print Hola
       // this.("Muge"); it gives compile error because constructor max call 1 just 1 call this()
        System.out.println("hello"); // than hello
    }

    public static void main(String[] args) {
        Test obj1 = new Test(); // this called just Hola
        Test obj = new Test(10); // first print Hola than hello
    }
}

public class This_Keyword {
    int a=100;  // this is instant variable

    public void method1(){   // this is instant method
        System.out.println(this.a); // this method calling instant variable
    }
    public void method2(){
        this.method1();  //this method calling instance method
    }

    public static void main(String[] args) {
      //  this.a // there is no abject instances

     //   System.out.println(This_Super_Keyword.a); // Calling this variable static way
                                                   // this is not static way you can not call static way (a is not static)
        // For calling i need a object
        // is name of class  reference object created  is default constructor
        This_Keyword obj = new This_Keyword(); // () this i default constructor

        System.out.println(obj.a);

    }
}
