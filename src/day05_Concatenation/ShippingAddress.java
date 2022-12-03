package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        /* Create a class called ShippingAddress.java
        Declare the following variables:
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
        Use concatenation to print the full address
*/

        String name = "Halid Erdur",
                buildingNumber = "185C",
                streetName = "Rua Flavio Costa",
                city = "Lisbon",
                state = "Portugal",
                zipCode = "1200-103";

        /*
        we can use coma instead semicolon cuz variable type is same (String)
        but at the end, always semicolon to close

        String name = "Halid Erdur";
        String  buildingNumber = "185";
        String streetName = "Flavio Costa";
        String city = "Lisbon";
        String state = "Portugal";
        String zipCode = "1200-103";
        */

      /*  System.out.println(name + "\n" + streetName + " " + buildingNumber
                + "\n" + city + ", " + state + " " + zipCode);  */

        String address = name + "\n" + streetName + " " + buildingNumber
                + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);

    }
}
