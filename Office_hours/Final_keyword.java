package Office_hours;

class Data{
    private final String password="123456"; // this is an instant variable --when we add final it gives us compile error
                                           // because final immutable you can not change them so you can get getter but
                                            //  cannot set

    public String getPassword(){ // getter same name with data type
        return password;           // and it would be return type
    }
   // public void setPassword(String password){  // setter we just go modifier
     //    this.password=password;              // setter has to be data type same name parameter
                                  // setter has to be parameter same name data type
    // }

    public final void printName(){        //this is method for he override we make sure is this class has sub class
        System.out.println("Hasan");
    }
    public  final  int printName(int a){
        return 10;
    }




}

public class Final_keyword extends Data{
   /*Override
    public void printName(){               // override method has to be in sub class
                                           // this is overriding when method with final you cant override it
        System.out.println("Muhammed");
    }*/

    final int a=100;
    final static double b=100;
    // final long a; it give us compile error

    public static void main(String[] args) {
        final int num=100;
        // num=300; this give compile error
        System.out.println("num = " + num);

        System.out.println(b); // even it can initialized still i can use it they have default values
                               // 0.0 default value
        final String username; //--- this is local variable it can not any compile error
    }
}
