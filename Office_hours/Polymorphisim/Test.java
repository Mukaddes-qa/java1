package Office_hours.Polymorphisim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
          Kentucky obj1  = new Kentucky();
          obj1.KFC();
          obj1.tax();

          States obj2 = new Kentucky();
          obj2.tax();

          // obj2.KFC(); --- It give compile error
        //  obj2.KFC();// REFERENCE TYPE DECIDES WHAT CAN BE CALLED
        // calling is reference name if is not in reference type there is no way to call them

          States obj3 = new California();
          obj3.tax(); // "Tax Rate in CA is %9"
          obj3.method1(); // it only check if it is overridden or not
                          // if it is overridden only overridden one executed

        List<Kentucky> list = new ArrayList<>();
        list.addAll(Arrays.asList(new Kentucky()));
         String name1 =list.get(0).stateName;// it gets first object

          System.out.println("name1 = " + name1);

          States [] arr = {new Kentucky(), new California()};

        //  States obj4= new States(); if super class not abstract class (like regular class
        //   i can create a object
        // Kentucky obj4 = new States(); sub class cannot be reference super class object
        // even this are not polymorphism
        }


        interface A{

        }
        class B implements A{
      //      public static void main(String[] args) {
             //   A obj = new B(); // super -type can be refence to child class object this is polymorphisim
            //    B obj2= new A(); // cannot create object from interfaces
            }
        }

        class C{

        }
        abstract  class D extends C{
            public static void main(String[] args) {
               // C obj1= new D(); // i can not created abject
            }
        }

