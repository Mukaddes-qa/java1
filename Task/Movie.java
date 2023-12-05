package Task;

public class Movie {
    private String movieName;
    private double length;
    private  String type;

    public Movie (String movieName, double length,String type){
        this.movieName=movieName;
        this.length=length;
        this.type=type;
    }

    public String getName (){
        return movieName;
    }

    public double getLength (){
        return length;
    }

    public String getType (){
        return type;
    }

    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
