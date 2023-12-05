package studyself;

public class ExcelTask {
    public static void main(String[] args) {
        int num = 1;
        int num2 = 1;
        String letter = "ABCD";
        System.out.println("***THIS IS HOW WE READ EXCEL***");
        for (num = 1; num <= 6; num++) {
            System.out.println("");
            for (num2 = 1; num2 <= 4; num2++) {
                System.out.print("Cell(" + num + "," + num2 + ") " + "");
            }
        }
        System.out.println("\n");

        System.out.println("***ACTUAL EXCEL USE A-Z FOR COLUMN***");
        System.out.println();
        for (int i = 1; i <=6 ; i++) {
            for (char j = 'A'; j <='D' ; j++) {
                System.out.print("Cell(" + i + "," + j + ")"+ " ");
            }
            System.out.println();

            // System.out.println("***ACTUAL EXCEL USE A-Z FOR COLUMN***");
            //        for (num = 1; num <= 6; num++) {
            //            System.out.println("");
            //            for (int n = letter.indexOf('A'); n <= letter.length() - 1; n++) {
            //                System.out.print("Cell(" + num + "," + letter.charAt(n) + ") " + "");

        }
    }
}
