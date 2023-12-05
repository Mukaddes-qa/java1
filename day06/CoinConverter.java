package day06;

public class CoinConverter {
    public static void main(String[] args) {
        // you have 2 dollar
        // how many quarter you can get 25c;
        // how many dime you can get 10c;
        // how many nickel you can get 5c;
        // how many penny you can get;
        int cent = 200;

        // you have purchase candle for 0.74 cent,
        // what would be remainder

        cent -= 74; // 126 cent after spending 74 cen for candle
        int quarter = cent / 25 ;// 126/25   -->> 5 , 1 is remaining
        int penny = cent%25 ; // 126/25 ----->> , 1 is remaining

        System.out.println(quarter);
        System.out.println(penny);

        // now i want to try to calculate dime for same money i got after purchase
        // in dime
        int dime = cent / 10 ; // -->> 126 / 10 -->> 12
        // how much penny i have after getting dime 126 % 10 -->> 6
        // creating new penny2 for not
        int penny2 = cent % 10; /// ---->>6
        System.out.println(dime);
        System.out.println(penny2);


    }

}
