import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

            System.out.println("Enter Current Houston Temperature in F");
            int temperature= sc.nextInt();

            System.out.println("Enter Current Houston Wind is ");
            int wind=sc.nextInt();

            System.out.println("Enter Current Houston Humidity is ");
            int humidity=sc.nextInt();

            System.out.println("Enter Current Houston Precipitation is ");
            int precipitation=sc.nextInt();


            System.out.println(("Current Houston tempature is " + temperature + "F")+"\n"
                    + "Current Houston wind is " + wind + "mph"+"\n"
                    + "Current Houston humidity is " + humidity + "%" +"\n"
                    + "Current Houston precipitation is " + precipitation + "%");

    }
}
