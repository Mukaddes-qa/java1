package day27;

import Notes.Array;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {
        /* Single dimensional array : contains values
        int [] arr = {1,2,3};
        Multi-Dimensional array : an arra that can contain array(s)
        N dimensional Array contains (N-1) dimensional arrays
        x: 2 dimensional array : contains 1 dimensional arrays
                          0 1 2   0 1 2
        int[][] arr2D = {{1,2,3},{4,5,6}}
                            0        1  */
        int[] arr1D = {1,2,3};
        // [index num of elements
        // arr1D===>2
        //2D array : is an array that contains single dimensional arrays
        int[][]arr2D = {{1,2,3},{4,5,6}};
        // index :
        // [INDEX NUM OF ID ARRAYS] [
        // arr2D[0]===>{1,2,3}        1
        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));

        // arr2D[0][2] ===>> 3
        System.out.println(arr2D[0][2]); // returns int value
        // print 5 : arr2D[][]
        System.out.println(arr2D[1][1]);

        System.out.println(Arrays.toString(arr2D[1])); // Arrays.toSting is only applicable to
        // Arrays.deepToString(muti-D Arrays);
        System.out.println(Arrays.deepToString(arr2D));



    }
}
