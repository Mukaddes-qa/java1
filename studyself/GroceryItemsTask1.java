package studyself;

public class GroceryItemsTask1 {
    public static void main(String[] args) {
        String[] groceryItems = new String[]{"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        Float[] storePrices = new Float[]{1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

        //1, loop through each grocery items and print them in one line
        System.out.println("Each grocey items : ");
        for (String items : groceryItems) {
            System.out.print(items + " ");
        }
        System.out.println();

        //  1.1 print each items at odd index
        for ( float oddNumber:storePrices) {
            if (oddNumber % 2 ==1) {
                System.out.print("Sum of odd Numbers : " + oddNumber + " ");
            }
        }
        System.out.println();
        System.out.println();

        // 1.2 print all items in reverse order
        System.out.println("Each grocery items reverse : ");
        for (int i = groceryItems.length-1; i>=0 ; i--) {
            System.out.print( groceryItems[i] + " " );
        }
        System.out.println();
        System.out.println();

        // 1.3 find out the index location of strawberry
        for (int i = 0; i <groceryItems.length ; i++) {
            if(groceryItems[i].equals("strawberry")){
                System.out.println("The index of strawberry is : " +i);
            }
        }
        System.out.println();

        //   1.4 find out the count of groceries that contains berry in the name
        int berryCount=0;
        for (int i = 0; i <groceryItems.length ; i++) {
            if(groceryItems[i].equals("berry")){
                berryCount++;
            }
        }
        System.out.println("The berry count is : " + berryCount);
        System.out.println();

        // 1.5 print out all the character counts of the grocery items
        int groceryCount = 0;
        for (int i = 0; i <groceryItems.length ; i++) {
            System.out.println("The count of characters in " +groceryItems[i]+ " is " +groceryItems[i].length());
        }
        System.out.println();

        //1.6
        System.out.println("Even character count items are:");
        for (int i = 0; i <groceryItems.length ; i++) {
            if(groceryItems[i].length() % 2 ==0){
                System.out.print( groceryItems[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();

      //  1.7 print out only those items end with letter e
        System.out.println("Items that end with e are:");
        for (int i = 0; i <groceryItems.length ; i++) {
            if(groceryItems[i].endsWith("e")){
                System.out.print(groceryItems[i]+ ", ");
            }
        }
        System.out.println();
        System.out.println();

        //1.8   1.8 print out only last 3 characters of all the items
        System.out.println("The last 3 characters of each item are: ");
        for (int i = 0; i <groceryItems.length ; i++) {
            String last3Chars = groceryItems[i].substring(groceryItems[i].length()-3);
            System.out.print(last3Chars+ ", ");
        }
        System.out.println();
        System.out.println();

        //1.9 create String variable called allItems and store all the items inside array separated by comma.
        String lastItem = "";
        String allItems = "";
        for (int i = 0; i <groceryItems.length ; i++) {
            lastItem = groceryItems[groceryItems.length-1];
            allItems = allItems+ groceryItems[i]+", ";
            if(i == groceryItems.length-2){
                break;
            }
        }
        System.out.print("All items : " +allItems + ""+ lastItem+ ".");

    }
}