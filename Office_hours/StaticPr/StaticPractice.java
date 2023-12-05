package Office_hours.StaticPr;
class Test{
    public Test(String str){
        System.out.println("Name is: " +str);
    }

    public void method(){ //this is local variable
      int a = 100;  // i used this only inside the method
        System.out.println(a);
    }


    // Test obj1= new Test(); object Must be created with existing constructor
    public static void main(String[] args) {
    //    System.out.println(a); // this is local variable can not use outside de method
        StaticPractice.staticMethod(); // NO NEED CREATE OBJECT BECAUSE TWO OF THEM STATIC

        StaticPractice obj = new StaticPractice();
        obj.staticMethod(); // static is shared by all the objects of the class
          // static should be called static way: through the class name


        if(true){ // if block
            int b=100; //local variable
        }
       // System.out.println(b); // local variables can not use outside the class

        Test obj2= new Test("Muhammed"); // name is Muhammed

    }
}
public class StaticPractice {  //called class name
    public static void staticMethod(){
        System.out.println("This is static method");
    }

    String name; // static variable they belong to the class
    static int stA=10; // static variable a
     int inB; // instance variable default value is 0

    public static void main(String[] args) {
       // System.out.println(name);// it give error because it is not class member

       // System.out.println(StaticPractice.name);// if i give with class name it works but no need this
        //System.out.println(name);// (if i used to name class no need class name, we call directly)

        StaticPractice obj1= new StaticPractice(); //this is first object
        obj1.stA=20;
        obj1.inB=200;
        StaticPractice obj2= new StaticPractice();//

        System.out.println(obj1.stA);//10-20 both of object shared same copy (after  obj1.stA=20;)
        System.out.println(obj2.stA);//10-20
        // after inB
        System.out.println(obj1.inB); // 0-200
        System.out.println(obj2.inB); // 0-0

        System.out.println("=========================================");
        // if i have multiple object in same class

        StaticPractice Gunel = new StaticPractice();
        Gunel.name="Gunel";
        StaticPractice yana = new StaticPractice();

        System.out.println(Gunel.name); // Gunel // static belongs to the class and this object create from class
        System.out.println(yana.name);  // Gunel  // so they shared same variable(only 1 copy)

       // method1(); compiler error/ it is not the class number

        StaticPractice obj3= new StaticPractice();
        obj3.method1();

    }

    public void method1(){ // instance method(non static)
        System.out.println(name); // static name i used directly just name in same class
    }
}
