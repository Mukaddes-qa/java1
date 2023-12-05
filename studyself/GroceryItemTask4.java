package studyself;

import java.util.Arrays;

public class GroceryItemTask4 {
    public static void main(String[] args) {
        String[] groceryItems = new String[]{"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        Float[] storePrices = new Float[]{1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

        //    4.1 swap the value of first item in array with last item of array , swap apple with kiwi

        String tempItem = groceryItems[0];
        groceryItems[0] = groceryItems[groceryItems.length - 1];
        groceryItems[groceryItems.length - 1] = tempItem;

        System.out.println("Last item " + groceryItems[0] + " is now first!");
        System.out.println("First item " + groceryItems[groceryItems.length - 1] + " is now the last!");
        System.out.println();

        System.out.println("Swap the value of first item in array with last item of array:");
        for (String items : groceryItems) {
            System.out.print(items + " ");
        }
        System.out.println();
        System.out.println();

        //           4.2 use for loop to loop through your groceryItems array and modify your items like this :
        //                    itemValue+itemCharacterCount
        //                    For example : {"apple5","banana6","grape5","strawberry10","blueberry9","kiwi4"}
        System.out.println("------items and char count------");
        for (int i = 0; i <= groceryItems.length - 1; i++) {
            System.out.print(groceryItems[i] + groceryItems[i].length() + ", ");
        }
        System.out.println();
        System.out.println();
        //           4.3 increase the value of each prices by one  in prices array
        System.out.println("---add 1 for each array-----");
        for (int j = 0; j < storePrices.length; j++) {
            System.out.print(storePrices[j] + 1 + ", ");
        }
        System.out.println();
        System.out.println();
        //           4.4 double the value of each prices in your array 1.99-->> 1.99*2
        System.out.println("---double value of each prices-----");
        for (int i = 0; i <storePrices.length ; i++) {
            System.out.print((storePrices[i]*2)+ " , ");
        }
        System.out.println();
        System.out.println();
        //           4.5 triple the value of each prices if it is less than 2 1.99 -->> 1.99*3
        System.out.println("---triple the value of each prices if it is less than 2-----");
        for (int i = 0; i <storePrices.length ; i++) {
            if(storePrices[i]<2){
                System.out.print((storePrices[i]*3)+ " , ");
            }
        }
        System.out.println();
        System.out.println();
        //           4.6 now find out highest price after the modification
        System.out.println("----After modification max price-----");
        Arrays.toString(storePrices);
        System.out.println(Arrays.toString(storePrices));
        float max = storePrices[0];
        for (int i = 0; i <= storePrices.length - 1; i++) {
            if (storePrices[i] > max) {
                max = storePrices[i];
            }
        }
        System.out.println(max);
        System.out.println();
        System.out.println();
        //           4.7 find out the most expensive item name. (edited)
        System.out.println("--------most expensive item------");
        max=0;
        int index = 0;
        for (int i = 0; i <= groceryItems.length - 1; i++) {
            if (storePrices[i] > max) {
                max = storePrices[i];
                index = i;
            }
        }
        System.out.println("most expensive item is "+storePrices[index]+" and the price is "+max);
    }
}