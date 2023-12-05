package studyself;

public class ReadingExcel {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("****THIS IS HOW WE READ EXCEL****");
        int num = 1;
        int num2 = 1;
        String abcd = "ABCD";
        for (num = 1; num <= 6; num++) {
            System.out.print("\n");//---->> or -->> System.out.println("");
            for (num2 = 1; num2 <= 4; num2++) {
                System.out.print("Cell(" + num + "," + num2 + ") " + "");
            }
        }
        System.out.println("\n");
        System.out.print("----ACTUAL EXCEL USE A-Z FOR COLUMN----");
        for (num = 1; num <= 6; num++) {
            System.out.print("\n");
            for (int n = abcd.indexOf('A'); n <= abcd.length() - 1; n++) {
                System.out.print("Cell(" + num + "," + abcd.charAt(n) + ") " + "");
            }
        }
    }
}
