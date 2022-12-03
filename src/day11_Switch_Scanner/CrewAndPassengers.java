package day11_Switch_Scanner;

public class CrewAndPassengers {


    /*
    Total: 50  ==> 20 crew, 30 passengers
    Total: 75  ==> 25 crew, 50 passengers
    Total: 100 ==> 30 crew, 70 passengers
    Any other number of people on the ship is not valid

    MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */
    public static void main(String[] args) {

        int number = 75;
        String result = null; // temporary value

        boolean validnumber = number == 50 || number == 75 || number == 100;

        if (validnumber) {

            if (number == 50) {
                result = "20 crew, 30 passengers";
            } else if (number == 75) {
                result = "25 crew, 50 passengers";
            } else {
                result = "30 crew, 70 passengers";
            }

        } else {
            result = "Invalid Number";
        }
        System.out.println("result = " + result);
    }
}
