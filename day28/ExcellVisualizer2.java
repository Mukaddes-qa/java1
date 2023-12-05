package day28;

import java.util.Arrays;

public class ExcellVisualizer2 {
    public static void main(String[] args) {
        int [][] myExcel= {   // this is the beginning of the 2D array object
                           {10,27,87,99}, // this is first 1D array
                             {87,100},    // this is second 1D array
                             {90,45,65}   // this is third 1D array
                         };          // this is the ending of the 2D array object
 /// what does deepString method do :
        // it takes an multiD array and turn it into a String with all items
        // what external data do we provide
        // the multiD array object or the multiD array variable
        // what do i get out of it
        // ---->> String representation of multiD array object
        System.out.println(Arrays.deepToString(myExcel));
        for( int[] eachRow :myExcel) {
            for(int eachCell :eachRow){
                System.out.print(eachCell+" ");

            }
            System.out.println();
        }
    }
}
