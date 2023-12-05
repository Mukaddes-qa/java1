package day41;

public class Product {

    String  name;
    double price;

    public String getName(){

        return this.name;
    }
    public void setName(String  newName){
        name =newName;
    }
    public double getPrice(){

        return this.price;
    }
    public void  setPrice(double newPrice){
        if(newPrice>0){
            this.price=newPrice;
        }
    }
}
