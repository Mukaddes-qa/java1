package day27;

public class ArrayPractice_3dArray {
    public static void main(String[] args) {
        //                    0        1           0         1
        int[][][] arr3D= {{{1,2,3},{4,5,6}}  , {{7,8,9},{10,11,12}}};
        //                        0                    1

        for (int i = 0; i <arr3D.length ; i++) { // each index of 2D array
            for (int j = 0; j <arr3D[i].length ; j++) { // each index number of 1D array
                for (int k = 0; k < arr3D[i][j].length; k++) { // each index number of the values
                    System.out.print(arr3D[i][j][k]+ " "); // returns value
                }
            }
        }
    }
}
