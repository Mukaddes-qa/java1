package day55;

public class TaxiAction {
    public static void main(String[] args) {
        //as soon as we want to create Taxi t1 object we need Engine eng to pass
// so first we created Engine so that we can pass when we create Taxi t1 object
// Any class can be a data type...
        Engine en = new Engine("V6", 400);
        Driver d = new Driver ("Pedro",12345);
        Taxi t1 = new Taxi(101, en,d);
        System.out.println("t1 = "+ t1.toString());
//when we print t1 we get a described out put as we have toString in Taxi class
// we also get a nice output for eng because we also have a toString in our Engine class.
// Taxi has plateNumber and eng, at the same time eng has its own type and horsePower
//so we get all when we have toString ---> association. relationship between two separate classes.
    Taxi t2 = new Taxi(102,new Engine("V8",600),
            new Driver("john", 12345));
        System.out.println("t2 = " + t2);
    
    
    
    }
}
