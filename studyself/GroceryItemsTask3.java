package studyself;

public class GroceryItemsTask3 {
    public static void main(String[] args) {
        String[] groceryItems = new String[]{"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        Float[] storePrices = new Float[]{1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

       // 3, assume that the order of grocery Items match the prices in same order do below:
            //    3.1 print first item and first price in one print statement -->>  apple price is 1.99
        System.out.println(groceryItems[0]+ "" + " price is " + storePrices [0]);
        System.out.println();
       // 3.2 print last item and last price in one print statement-->>  kiwi price is 2.88
        System.out.println(groceryItems[5]+ "" + " price is " + storePrices [5]);
        System.out.println();
       // 3.2 print all items and prices in one for loop together
        for (int i = 0; i <groceryItems.length ; i++) {
            System.out.println(groceryItems[i]+ "price is --->> " + storePrices[i] );
        }

        // 3.3 print only those items with price more than 3.11

        for (int i = 0; i <storePrices.length ; i++) {
            if(storePrices[i]>3.11){
                System.out.println(" Store prices over 3.11 is " + storePrices[i]);
            }
            System.out.println();
        }

       // 3.4 print only those items with price more than average
        float sum=0;
        float average=0;
        for (int i = 0; i <storePrices.length ; i++) {
            sum = sum + storePrices[i];
            average = sum / storePrices.length;
            System.out.println("Average prices is " + average);
        }
        System.out.println();
            for (int j = 0; j <storePrices.length ; j++) {
                if(storePrices[j]>average){
                    System.out.println("This prices over average is " + groceryItems[j]);
                }
            }
            System.out.println();

        //3.5 print only those prices of grocery items that contains letter b
        for (int i = 0; i < groceryItems.length ; i++) {
            if(groceryItems[i].contains("b"));
            System.out.println("Grocery items contains 'b' = "+  groceryItems[i]);
        }
        System.out.println();
       // 3.6 print the item name with max price
        float maxPrice=storePrices[0];
        for (int i = 0; i <storePrices.length ; i++) {
            if(storePrices[i]>maxPrice){
                maxPrice=storePrices[i];
                System.out.println("Max prices is = " + maxPrice + " Max price item is " + groceryItems[i]);
            }
        }
        System.out.println();
        //3.7 print the item name with min price
        float minPrice=storePrices[0];
        for (int i = 0; i <storePrices.length ; i++) {
            if(storePrices[i]<minPrice){
                minPrice=storePrices[i];
                System.out.println("Min prices is = " + minPrice + " Min price item is " + groceryItems[i]);
            }
        }

    }
}
