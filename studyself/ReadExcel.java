package studyself;

public class ReadExcel {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("Cell(" + i + "," + j + ") ");
                if (j % 4 == 0) {
                    System.out.println();
                }
            }
            System.out.println("_________________");
            for (int x = 1; x < 7; x++) {
                char y;
                for (y = 'A'; y < 'E'; y++) {
                    System.out.print("Cell(" + x + "," + y + ") ");
                    if (y == 'D') {
                        System.out.println();
                    }
                }
            }
        }
    }}