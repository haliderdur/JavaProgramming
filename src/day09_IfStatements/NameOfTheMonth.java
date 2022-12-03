package day09_IfStatements;

public class NameOfTheMonth {
    public static void main(String[] args) {
        int month = 9;
        String nameOfMonth = null;

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
            nameOfMonth = "January";
        } else if (february) {
            nameOfMonth = "February";
        } else if (march) {
            nameOfMonth = "March";
        } else if (april) {
            nameOfMonth = "April";
        } else if (may) {
            nameOfMonth = "May";
        } else if (june) {
            nameOfMonth = "June";
        } else if (july) {
            nameOfMonth = "July";
        } else if (august) {
            nameOfMonth = "August";
        } else if (september) {
            nameOfMonth = "September";
        } else if (october) {
            nameOfMonth = "October";
        } else if (november) {
            nameOfMonth = "November";
        } else if (december) {
            nameOfMonth = "December";
        }
        System.out.println(nameOfMonth);


    }
}
