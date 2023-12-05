package studyself;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueStringWithArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result=0;
        for(int i=0; i<matrix.length; i++){
            result+=matrix[i][i];
            result-=matrix[i][(matrix.length-1)-i];
        }


        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}