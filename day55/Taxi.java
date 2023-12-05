package day55;
// Taxi Engine --Driver --Paasengers
public class Taxi {

    int plateNumber;
    Engine eng;
    Driver dr;

    public Taxi(int plateNumber, Engine eng,Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr=dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", Engine=" + eng.toString() +
                ", Driver=" + dr.toString() +
                '}';
    }
}
class Driver{
 String name;
 int DdriverId;

    public Driver(String name, int ddriverId) {
        this.name = name;
        DdriverId = ddriverId;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", DdriverId=" + DdriverId +
                '}';
    }
}


class Engine{
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}

