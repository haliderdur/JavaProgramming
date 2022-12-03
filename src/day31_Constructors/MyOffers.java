package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

/*
2. Create a class named MyOffers:
        2.1 Create 7 objects of Offer
        2.2 Create an array of Offers named myOffers and store all 7 objects of offers
        2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
            2.3.1 Write a program that can remove the offer objects that are not full-time
        2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
            2.4.1 Write a program that can remove all the offers that are not from local
        2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
            2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
        2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
            2.6.1 Write a program that can remove all the offers that are not for SDET
        2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
            2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */
public class MyOffers {
    public static void main(String[] args) {
        Offer myOffer1 = new Offer();
        myOffer1.setInfo("WA", "Google", "SDET", 120000, true, false, true, true);

        Offer myOffer2 = new Offer();
        myOffer2.setInfo("CA", "Microsoft", "BA", 100000, true, true, false, true);

        Offer myOffer3 = new Offer();
        myOffer3.setInfo("Poland", "EPAM", "SDET", 70000, true, false, true, true);

        Offer myOffer4 = new Offer();
        myOffer4.setInfo("FL", "Amazon INC", "Scrum Master", 90000, false, true, false, false);

        Offer myOffer5 = new Offer();
        myOffer5.setInfo("Germany", "Sony INC", "Developer", 90000, true, true, false, false);

        Offer myOffer6 = new Offer();
        myOffer6.setInfo("Portugal", "Apple INC", "SDET", 60000, true, false, true, true);

        Offer myOffer7 = new Offer();
        myOffer7.setInfo("Estonia", "CapitalONE", "Developer", 60000, true, true, false, false);

        System.out.println("myOffer1 = " + myOffer1);
        System.out.println("myOffer2 = " + myOffer2);
        System.out.println("myOffer3 = " + myOffer3);
        System.out.println("myOffer4 = " + myOffer4);
        System.out.println("myOffer5 = " + myOffer5);
        System.out.println("myOffer6 = " + myOffer6);
        System.out.println("myOffer7 = " + myOffer7);


        Offer[] myOffers = {myOffer1, myOffer2, myOffer3, myOffer4, myOffer5, myOffer6, myOffer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime); // removes if the offer is NOT full time
        System.out.println("Full Time Offers = " + fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !(p.location.equals("Portugal") || p.location.equals("Germany")));
        System.out.println("Local Offers = " + localOffers.size());

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " " + localOffer.location + " : $" + localOffer.salary);
        }

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p -> (p.hasBenefit == false || p.hasPTO == false));
        System.out.println("Offers With Benefits = " + offersWithBenefits.size());

        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p -> p.jobTitle != "SDET");
        System.out.println("SDET Offers = " + sdetOffers.size());

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));
        offersWith100K.removeIf(p -> p.salary < 100000);
        System.out.println("Offers With +100K = " + offersWith100K.size());


    }
}
