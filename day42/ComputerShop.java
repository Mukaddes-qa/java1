package day42;

public class ComputerShop {
    public static void main(String[] args) {
        Computer c1= new Computer();
        c1.setBrand("Apple");
        c1.setRam(128);
        c1.setPrice(1000);

        c1.runProgram();
        c1.calculate();
        System.out.println("c1= " + c1.toString());

        int myRam = c1.getRam();
        System.out.println("myRam = " + myRam);
        
        Computer c2 = new Computer();
        c2.setBrand("Dell");
        c2.setRam(myRam/4);
        c2.setPrice(c1.getPrice()/2);
        
        c2.runProgram();
        c2.calculate();
        System.out.println("c2.toString() = " + c2.toString());
        
    }
}
