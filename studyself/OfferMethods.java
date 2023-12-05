package studyself;

public class OfferMethods {
    public static void main(String[] args) {
        Offer myOffer = new Offer();
        myOffer.location= "Texas";
        myOffer.company="Apple";
        myOffer.salary=100.000;
        myOffer.fullTime="full time";

        System.out.println("My offer is = " + myOffer.company);
        System.out.println("My offer location is = " + myOffer.location);
        System.out.println("My offer salary is = " +myOffer.salary );
        System.out.println("My offer hours status = " + myOffer.fullTime);
        System.out.println("-----------------------");

        myOffer.myOfferLocation();
        myOffer.changeSalaryTo(200.000);

    }
}
