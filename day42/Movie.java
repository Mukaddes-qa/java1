package day42;

public class Movie {
    private String name;
    private double length;
    private String type;

    public Movie(){
        System.out.println("EMPTY MOVIE");
    }
    // write a constructor to set all the fields movie
    public Movie(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //toString method so we can directly print out
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
