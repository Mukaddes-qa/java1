package studyself;

public class NestedLoopRowCloumn {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print("IRow " + i + "-Column " + j);

            }

        }
        System.out.println("--------------------------------");
        //For each loops
        int[] cols = {1, 2, 3,};
        int[] rows = {1, 2, 3, 4};
        for (int row : rows) {
            System.out.println();
            for (int column : cols) {
                System.out.print("IRow " + row + "-Column" + cols);

            }
        }
        System.out.println("---------------------------------");
        int row = 0;
        while(row<5){
            row++;
            System.out.println();
            int col = 0;
            while(col<5) {
                col++;
                System.out.print("Row" + row +"Column" + col);
            }
        }

    }}