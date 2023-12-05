package Task;

import java.util.Scanner;

public class AdiitionalTask {
    public static void main(String[] args) {
     /*   Additional Task on this :
        1, Write a program to ask user row and column number and return the value in that cell.
         if it's invalid row or column number , it should print invalid input.
        for example : row 1 and column 4 has 84
        row 7 and column 1 -->> INVALID! There are only 6 row and 4 columns
        Optionally : keep asking user until the user input row and column are not out of range.
        2, Write a program to search a value in excel and print the all location of the value :
        for example : 67 --> Cell(4,1)  Cell(4,4) Cell(6,1)
        3, Write a program to ask user for column number and print only that column data :
        for example : 2 -->  54 , 44 , 88 , 33 , 88 , 33 */
        int[][] excel = {{78,54,100,84}, {33,44,77,123}, {12,88,52,76}, {67,33,98,67}, {12,88,52,45}, {67,33,98,34}};
        System.out.println("This program will print the value in a given cell in excel sheet");
        Scanner scan = new Scanner(System.in);
        boolean inRange = true;
        while (inRange) {
            System.out.println("Enter row number: ");
            int row = scan.nextInt();
            System.out.println("Enter column number:");
            int column = scan.nextInt();
            if (row<=6 && column<=4) {
                System.out.println(excel[row - 1][column - 1]);
            }
            else {
                inRange = false;
            }
        }
        System.out.println("INVALID! There are only 6 rows and 4 columns");
    }
}
