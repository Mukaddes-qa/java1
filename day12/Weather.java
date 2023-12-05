package day12;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today in Corpus Christi: ");
        String corpusChristiWeather= scan.nextLine();
        if (corpusChristiWeather.equals("Sunny")){
            System.out.println("Code in Sunny weather");
        }else  if (corpusChristiWeather.equals("Rainy")){
            System.out.println("Code in Rainy weather");
        }else  if (corpusChristiWeather.equals("Cloudy")){
            System.out.println("Code in Cloudy weather");
        }else  if (corpusChristiWeather.equals("Snowy")){
            System.out.println("Code in Snowy weather");
        }else {
            System.out.println("Rain or Shine just keep coding anyway!");
        }
    }
}
