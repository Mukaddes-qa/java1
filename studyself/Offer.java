package studyself;

public class Offer {
    String location;
    String company;
    double salary;
    String fullTime;


    public void myOfferLocation (){
        System.out.println("My offer location is " + location);
    }
    public void changeSalaryTo(double newSalary){
        salary=newSalary;
        System.out.println("My new salary is " + newSalary);
    }

    public void displayInformation() {
    }
}
