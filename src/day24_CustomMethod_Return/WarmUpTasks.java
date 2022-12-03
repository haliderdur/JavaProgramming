package day24_CustomMethod_Return;

public class WarmUpTasks {
    public static void main(String[] args) {
        initials("Halid", "erdur");
        System.out.println("-----------------------------");

        domain("halid.erdur@gmail.com");
        System.out.println("-----------------------------");

        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "halid@google.com", "jack@hotmail.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("-----------------------------");

        nameOfMonth(12);
        System.out.println("-----------------------------");

        nameOfDay(7);
        System.out.println("-----------------------------");

        daysInMonth("January");


    }

    // Create a method that can display the initials of the person - initials(String firstName , String lastName)
    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase(); // to ensure that the initials will be printed as uppercase
        System.out.println("initials: " + initial);
    }

    // Create a method that can display the domain of the email - domain(String before@, String after@)
    public static void domain(String email) { // halid.erdur@gmail.com
        String domain = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));
        System.out.println("domain: " + domain);
    }

    // Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {
        String monthName = "";

        if (number >= 1 && number <= 12) {
            monthName = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April"
                    : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August"
                    : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";
        } else {
            monthName = "invalid";
        }
        System.out.println("Month name: " + monthName);
    }

    // Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {
        String dayName = "";
        if (number >= 1 && number <= 7) {
            dayName = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" :
                    (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            dayName = "invalid";
        }
        System.out.println("Day name: " + dayName);
    }

    // Create a method that can print how many days a month has
    public static void daysInMonth(String month) {
        int days = 0;
        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("March")
                || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")
                || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("December")) {
            days = 31;
        } else if (month.equalsIgnoreCase("February")) {
            days = 29;
        } else {
            days = 30;
        }
        System.out.println(days);
    }


}
