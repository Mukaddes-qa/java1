package day35;

public class GroceryTask {
    public static void main(String[] args) {
        //                 0   1     2  3    4    5    6    7   8    9
        String sentence = "I bought 3 tomato and the price was 3.14 each";
// How much is your final checkout price 
// The count is always 3rd word 
// The price is always at 2nd word from the last 

        String[] allWords = sentence.split(" ");

        double count = Integer.parseInt(allWords[2]); // 3
        // getting the last element of any array we use index length-1
        // getting the second last element of any array we use index lengt-2

        float price = Float.parseFloat(allWords[allWords.length-2]); //3.14
        double total = count * price;
        System.out.println("Total price is : " + total);





    }
}
