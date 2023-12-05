package Day53;

public class FruitShop {
    // only Reference Type Decide what you can access at compile time
    // if we have Fruit as reference type, getDigested method will point to the one under Fruit class
    // actual object type decide what method  will be called ar run time
    public static void main(String[] args) {
        Apple a1= new Apple("sweet","red","Fuji");
        // what can i access using reference variable a1
        //a1 has Apple as reference type, we can access anything inside apple
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        a1.getDigested();
        System.out.println("------------------------------------");
        Fruit f1 = a1;//new Apple("sweet","red","Fuji"); // its is upcasting , polymorphsim
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
       // f1.type // we cannot access type coming from apple if we refer it as Fruit

        //if fruit does not have getDigestted method
        // below will not compile
        // because only reference type decide what you can access

        f1.getDigested();
        f1= new Orange("sour -sweet", "redish",11);
        System.out.println("f1 = " + f1);//f1 = Orange{vcLevel=11, taste='sour -sweet', color='redish'}


        System.out.println(f1.toString());//Orange{vcLevel=11, taste='sour -sweet', color='redish'}


        //Fruit is reference type, Apple is actual object type
        Fruit f2= new Apple("crispy but tasteless", "hot red","Gala");
        Fruit f3= new Orange("sour","orange",12);
        Fruit f4 =new Orange("very sweet","Blood Red", 10);

        Fruit[] muFruits = {f1,f2,f3,f4};
        for(Fruit each:muFruits){
            each.getDigested();
        }

    }
}
