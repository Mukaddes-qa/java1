package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoviePractice {
    public static void main(String[] args) {
        Movie movie1= new Movie ("Taare Zameen Par",2.42,"Drama/Music");
        Movie movie2= new Movie ("Alis wedding ", 1.49, "Romantic Comedy");
        Movie movie3= new Movie ("My perfect Romance", 1.31, "Romantic");
        Movie movie4=new Movie("My Girls", 1.42, "Action");
        Movie movie5 = new Movie ("Butterflys Dream", 1.58, "Action");
        Movie movie6 = new Movie ("Ask tesadufleri sever", 2.2, "Dramas");
        Movie movie7 = new Movie ( "New york minute", 1.30, "Comedies");
        Movie movie8= new Movie ("Holiday in the wild ", 1.26, "Dramas");
        Movie movie9 = new Movie ("Eat pray love ", 2.20, "Dramas");
        Movie movie10= new Movie ("American son ", 1.30, "Dramas");
        
        List<Movie> movies = new ArrayList<>(Arrays.asList(movie1,movie2,movie3, movie4,movie5,movie6,movie7,movie8,movie9,movie10));
        System.out.println("movies = " + movies);


        for(Movie each: movies){
            if(each.getLength()<2){
                System.out.println("Movies less than 2 hours : " + each.getName());
            }
        }

        for(Movie each : movies){
            if(each.getLength()>2){
                System.out.println("Movies more than 2 hours : " + each);
            }
        }

        for(Movie each : movies){
            if(each.getType().equals("Action")){
                System.out.println("Action Movies = " + each.getName());
            }
        }

        Movie longestMovies = movies.get(0);
        for(Movie each : movies){
            if(each.getLength()>longestMovies.getLength()){
                longestMovies=each;
            }
        }
        System.out.println("longestMovies = " + longestMovies);


    }

    }

