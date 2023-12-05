package MuhtarsVideos.car;

import MuhtarsVideos.car.Car;

public class CarObject {
    public static void main(String[] args) {
        Car car1 =    new      Car(); // default constructor(beacuse default constructor exist)
    //ClassName  objName   keyword  Constructor

        car1.brand= "BMW";
        car1.color= "white";
        car1.milage= 123333;
        car1.Model= "X6";
        car1.price = 15000.5;
        car1.year= 2020;

        System.out.println(car1.brand); //BMW
        System.out.println(car1.color); // white
        System.out.println(car1.milage); // 123333
        System.out.println(car1.Model); // X6
        System.out.println(car1.price); // 15000.5
        System.out.println(car1.year); // 2020

        // we can create multiple object

        Car car2 = new Car();

        System.out.println(car2.brand); // null --> because car2 have any brand value(didn't initialized)

        // i need to store some data (instance variable)
        car2.brand= "Toyota";
        car2.year = 2000;

        System.out.println(car1.brand); // Toyota
        System.out.println(car2.brand);

        car1.drive();  // Driving BMW
        car2.drive();  // Driving Toyota

        car1.start();  // BMW is started
        car2.start();   // Toyota is started

        car1.getInfo();  // 2020 BMW X6, white, $15000.5
        car2.getInfo();  // 2000 Toyota null, null, $0.0

        Car car3 = new Car();
        car3.getInfo(); // it give us default values because it doesnt initialized any value


        // THIS IS CUSTOM CLASS CAR CLASS HAVE ATTRIBUTES AND ACTION
        //                             instance variable   instance method


        // java works top the bottom

    }
}
