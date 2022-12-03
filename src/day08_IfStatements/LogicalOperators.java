package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Halid";
        int age = 32;
        String citizenship = "Portugal";

        boolean isEligibleToVote = age >= 18 && citizenship == "Portugal";
        //                          32 >= 18  &&  "Portugal" == "Portugal"
        //                            true    &&    true      ==> true
        System.out.println(name + " is eligible to vote in Portugal: " + isEligibleToVote);

        System.out.println("-------------------------------------------------------");

        String name2 = "Alex";
        int creditScore = 800;
        int age2 = 45;
        int income = 40000;

        boolean iseligible2 = creditScore >= 750 && age2 >= 21 && income >= 25000;
        System.out.println(name2 + " is eligible for loan: " + iseligible2);

        System.out.println("-------------------------------------------------------");

        String name3 = "Jack";

        int age3 = 21;
        char gender = 'M';
        boolean iseligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                     21 >= 18  &&   'M' == 'M' ||   'M' == F
        //                       true    &&   ( true     ||     false )
        //                       true    &&    true
        //                       true
        System.out.println(name3 + " is eligible to register: " + iseligible3);

        System.out.println("-------------------------------------------------------");

        String name4 = "James";

        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;
        int livingInUS = 8;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true || livingInUS >= 5;
        //                              false         ||           false            ||      true          ==> TRUE

        System.out.println(name4 + " is eligible to apply US citizenship: " + isEligible4);

        System.out.println("-------------------------------------------------------");

        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------------------------");

        String name5 = "Mike";
        int examScore = 45;
        boolean passed = examScore >= 75;
        boolean failed = !passed;

        System.out.println(name5 + " passed = " + passed);
        System.out.println(name5 + " failed = " + failed);

    }
}
