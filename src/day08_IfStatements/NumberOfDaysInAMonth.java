package day08_IfStatements;

/*
write a program that can display the number of days in a month
    ex:
        number = 1 ~ 12

    output:
        31 Days

    Hint:
        Months that have 31 days: 1, 3, 5, 7, 8, 10, 12
        Months that have 30 days: 4, 6, 9, 11
        Month that has 28 days: 2
 */
public class NumberOfDaysInAMonth {
    public static void main(String[] args) {

        int month = 7;

        boolean has28Days = month == 2,
                has30Days = month == 4 || month == 6 || month == 9 || month == 11,
                has31Days = !has30Days && !has28Days;  // has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;

        if (has31Days) {
            System.out.println("31 Days");
        }
        if (has30Days) {
            System.out.println("30 Days");
        }
        if (has28Days) {
            System.out.println("28 Days");
        }


    }
}
