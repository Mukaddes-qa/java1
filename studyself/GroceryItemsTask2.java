package studyself;

public class GroceryItemsTask2 {
    public static void main(String[] args) {
        String[] groceryItems = new String[]{"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        Float[] storePrices = new Float[]{1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

        //2.0, loop through each prices  and print them in one line
        System.out.println("The price of each item is: ");
        for (float eachPrice : storePrices) {
            System.out.print(eachPrice + ", ");
        }
        System.out.println();
        System.out.println();

        //  2.1 print each prices in even index
        System.out.println("even prices in store prices : ");
        for (float evenNumber : storePrices) {
            if (evenNumber % 2 == 0) {
                continue;
            }
            System.out.print(evenNumber + " ");
        }
        System.out.println();
        System.out.println();

        //  2.2 print only prices less that 3 dollars
        System.out.println("Prices are less than 3 dollar : ");
        for (Float lessThan3Dollars : storePrices) {
            if (lessThan3Dollars > 3) {
                continue;

            }
            System.out.print(lessThan3Dollars + " ");
        }
        System.out.println();
        System.out.println();
        // 2.3 print the sum of all the prices and get average
        float sumOfPrices = 0;
        float average;

        for (int i = 0; i < storePrices.length; i++) {
            sumOfPrices = sumOfPrices + storePrices[i];

        }
        average = sumOfPrices / storePrices.length;

        System.out.println("The sum of all prices is: " + sumOfPrices);
        System.out.println();
        System.out.println("The average price is: " + average);
        System.out.println();
// 2.4 print only prices more than average price
        System.out.println("Prices are more than average prices : ");
        for (Float moreThan : storePrices) {
            if (moreThan < average) {
                continue;

            }
            System.out.print(moreThan + " ");
        }
        System.out.println();
        System.out.println();

        // 2.7 find out max price and print out max price and  index of max price

        float max = storePrices[0];
        for (int i = 0; i < storePrices.length; i++) {
            if (storePrices[i] > max) {
                max = storePrices[i];
            }
        }
        System.out.println("The maximum price is: " + max);
        for (int i = 0; i < storePrices.length; i++) {
            if (storePrices[i] == max) {
                System.out.println();
                System.out.println("The index of max is " + i);
            }
        }
        System.out.println();

        //2.8 find out the minimum price and index of minimum price
        float min = storePrices[0];
        for (int i = 0; i < storePrices.length; i++) {
            if (storePrices[i] < min) {
                min = storePrices[i];
            }
        }
        System.out.println("The min price is: " + min);
        for (int i = 0; i < storePrices.length; i++) {
            if (storePrices[i] == min) {
                System.out.println();
                System.out.println("The index of min is " + i);
            }
        }
        System.out.println();
        // 2.9 find out second max price and index
        float secondMax = storePrices[0];
        for (int i = 0; i < storePrices.length; i++) {
            if (storePrices[i] < max && storePrices[i] > secondMax) {
                secondMax = storePrices[i];
            }
        }
        System.out.println("The second maximum price is: " + secondMax);
        System.out.println();
        for (int i = 0; i < storePrices.length; i++) {
            if (storePrices[i] == secondMax) {
                System.out.println("The index of second maximum price is: " + i);

            }
        }
    }
}