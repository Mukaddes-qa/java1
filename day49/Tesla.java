package day49;
public class Tesla extends Vehicle implements Autonomus,Chargable {
    int horsePower;
    String method;

    public Tesla(int year,int horsePower, String method) {
        super(year);
        this.horsePower=horsePower;
        this.method=method;

    }
    @Override
    public void selfDrive() {
        System.out.println("Tesla Self Drives");
    }

    @Override
    public void start() {
        System.out.println("Tesla starts");
    }

    @Override
    public void goForward() {
        super.goForward();
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", year=" + year +
                '}';
    }
}
