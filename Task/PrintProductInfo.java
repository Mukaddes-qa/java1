package Task;

public class PrintProductInfo {
    public static void main(String[] args) {
printProductInfo("Fire","HD",8,79.99f);
    }

    public static void printProductInfo(String productName, String model, int version, float price) {
        System.out.println("I saw " + productName + " " + model + version + " hands-free with Alexa for " + price);
    }
}