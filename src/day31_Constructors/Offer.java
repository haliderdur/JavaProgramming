package day31_Constructors;
/*
Offer Task:
    1. Create a custom class named Offer
            Attributes: location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime
            Actions:
                setInfo(): sets all the instance variables
                toString(): returns the full info of the Offer Object
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

public class Offer {
    public String location, companyName, jobTitle;
    public double salary;
    public boolean hasBenefit, hasPTO, isWFH, isFullTime;

    public void setInfo(String location, String companyName, String jobTitle, double salary
            , boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
