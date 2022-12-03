package day08_IfStatements;

/*
write a program that can display the name of month
    number = 1 ~ 12
 */
public class NameOfMonth {
    public static void main(String[] args) {

        int month = 8;

        boolean january = month == 1,
                february = month == 2,
                march = month == 3,
                april = month == 4,
                may = month == 5,
                june = month == 6,
                july = month == 7,
                august = month == 8,
                september = month == 9,
                october = month == 10,
                november = month == 11,
                december = month == 12;

        if (january) {
            System.out.println("January");
        }
        if (february) {
            System.out.println("February");
        }
        if (march) {
            System.out.println("March");
        }
        if (april) {
            System.out.println("April");
        }
        if (may) {
            System.out.println("May");
        }
        if (june) {
            System.out.println("June");
        }
        if (july) {
            System.out.println("July");
        }
        if (august) {
            System.out.println("August");
        }
        if (september) {
            System.out.println("September");
        }
        if (october) {
            System.out.println("October");
        }
        if (november) {
            System.out.println("November");
        }
        if (december) {
            System.out.println("December");
        }
    }
}