package day12;

public class CarShopping {
    public static void main(String[] args) {
        String carBrand="Tesla";
        int carPrice=30000;
        int budget=40000;

       // if(carBrand.equals("corolla") || carBrand.equals("Tesla") &&carPrice<=budget){
          //  System.out.println("CAR AQUIRED ! ! !");
        //}else{
         //   System.out.println("NOT WHAT I AM LOOKING FOR ");

        if(carBrand.equals("corolla")){
            System.out.println(" CAR ACQUIRED ! ! ! ");
        }else if (carBrand.equals("Tesla") && carPrice<= budget){
            System.out.println(" CAR ACQUIRED ! ! ! ");
        }else{
            System.out.println("NOT WHAT I AM LOOKING FOR ");
        }
    }
}
