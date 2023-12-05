package day13;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {
        String memberType="Prime Member";
        double amount =15.99d;
        int shippingFee=0;

        if (memberType.equalsIgnoreCase("PRIME MEMBER") && amount>25){
            System.out.println("Your final price is " + amount + "and shipping fee: " + shippingFee);
            System.out.println("Get free shipping in all purchase no matter the amount");
        }else if(!memberType.equalsIgnoreCase("PRIME MEMBER")){
            System.out.println("Get free shipping only if their pruchase is more than 25$! ");
            System.out.println("You got free shippin on amount " +amount);
        }else{
            System.out.println("Your shipping fee 5$");
            shippingFee=5;
            amount=amount+shippingFee; // amount += shippingFee
            System.out.println("Your final amount is " + amount);
        }
    }
}
