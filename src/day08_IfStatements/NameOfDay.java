package day08_IfStatements;

/*
write  program that can display the name of the day
    number = 1 ~ 7
 */
public class NameOfDay {
    public static void main(String[] args) {

        int day = 5;

        boolean monday = day == 1,
                tuesday = day == 2,
                wednesday = day == 3,
                thursday = day == 4,
                friday = day == 5,
                saturday = day == 6,
                sunday = day == 7;


        if (monday) {
            System.out.println("MONDAY");
        }
        if (tuesday) {
            System.out.println("TUESDAY");
        }
        if (wednesday) {
            System.out.println("WEDNESDAY");
        }
        if (thursday) {
            System.out.println("THURSDAY");
        }
        if (friday) {
            System.out.println("FRIDAY");
        }
        if (saturday) {
            System.out.println("SATURDAY");
        }
        if (sunday) {
            System.out.println("SUNDAY");
        }
    }
}
