package MuhtarsVideos.car;

public               class Car {
 // access modifier  //

   // string class also have public access modifier
   String Model;
   int year;
   String brand;
   String color;
   double price;
   long milage;

   // these are attributes ob car class --->> instance variables

   // every class must have constructor
   // if you do not create constructor by yourself -->java compile give us default constructor

   public void drive() { // this is instance method
      System.out.println(" Driving" + brand);
   }
   public void start(){
      System.out.println(brand+ "is started");
   }
   public void getInfo(){
      System.out.println(year + " " + brand + " " + Model + ", " +  color + ", $" + price);
   }
}
