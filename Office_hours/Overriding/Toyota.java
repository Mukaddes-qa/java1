package Office_hours.Overriding;

public class Toyota extends car {
    public void start(){
        System.out.println("Push Button and start");
    }
    public static void main(String[] args) {
        Toyota car1 =new Toyota();
        car1.start();

        car car2 = new car();
        car2.start();

        Jeep car3= new Jeep();
        car3.start();
    }

}
