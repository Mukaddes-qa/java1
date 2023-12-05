package Office_hours;

import day44.SlackUser;

class TestData{  // this is super class like parent

    public TestData(){
        System.out.println("A");
    }

    int a =100; // instant variable

    public  void Method1(){  // instant method
        System.out.println("super class instant method");
    }
}

public class Super_Keyword extends TestData { // this is sub class like child
    public Super_Keyword(){
       super();  // A
        System.out.println("B");
    }

    public  void Method1(){  // override
        System.out.println("sub class instant method");
    }

    public static void main(String[] args) {
       // super.a=300;
        // super.method1()---- these give compile error
       // mm(); you can not because this instance method you need create a object
        Super_Keyword obj = new Super_Keyword();
        obj.mm();


    }
    public void mm(){
        System.out.println(super.a);  // calling th instance variable from super
        super.Method1(); // caling the instance method from super class

    }
    public void mm2(){
        System.out.println(super.a);
        this.Method1(); // calling instance methods from the curren class
    }

}

