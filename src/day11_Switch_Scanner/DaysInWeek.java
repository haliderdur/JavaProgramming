package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        /*
        1. We can not use these variables with switch; long - float - double - boolean
        2. Case value MUST match with switch' data type and unique
        3. break: used for exiting the switch
                if we don't give the break statement, switch continues to execute the next blocks until the next break statement ot } of the switch
         4. Default block gets executed if none of the case blocks matched.
         */

        int number = 12;

        switch (number) { // 7 days in a week ==> 1, 2, 3, 4, 5, 6, 7   ==
            case 1:
                System.out.println("Monday");
                break;  // exits the switch after executing this block

            case 2:
                System.out.println("Tuesday");
                break;  // exits the switch after executing this block

            case 3:
                System.out.println("Wednesday");
                break;  // exits the switch after executing this block

            case 4:
                System.out.println("Thursday");
                break;  // exits the switch after executing this block

            case 5:
                System.out.println("Friday");
                break;  // exits the switch after executing this block

            case 6:
                System.out.println("Saturday");
                break;  // exits the switch after executing this block

            case 7:
                System.out.println("Sunday");
                break;  // exits the switch after executing this block

            default:
                System.out.println("Invalid Number");
                break;  /* if the default block is at the very end right before closing curly brace,
                        then we don't have to use break cuz execution will be ended with curly brace */

        }


    }

}
