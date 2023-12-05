package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {
        String[] marvelHeros = {"MIron an ", "Captain America", "Spiderman",
                "Black Panther", "Hulk","Black Widow", "Wanda","Capitan Marvel",
                "Iron Man ", "Captain America", "Spiderman",
                "Black Panther", "Hulk","Black Widow", "Wanda","Capitan Marvel"};

        System.out.println("marvel Heros = " + Arrays.toString(marvelHeros));
        int sizeOfArray = marvelHeros.length;
        System.out.println("Marvel Heros count = " + sizeOfArray);

        String itemToSearch= "Captain America";
        int countOfItem = 0;

        for(String eachHero :marvelHeros){
            if(eachHero.equals(itemToSearch)){
                countOfItem++;
            }
        }
        // COUNT THE HERO WITH WITH THE NAME CONTAINS BLACK IN CASE INSENSITIVE MANNER

        System.out.println("Count of item = " + countOfItem);

        int countBlack = 0;
        for (String eachWord : marvelHeros) {
            if (eachWord.contains("Black")) {
                countBlack++;
            }
        }
        System.out.println("countBlack = " + countBlack);

    }
}
