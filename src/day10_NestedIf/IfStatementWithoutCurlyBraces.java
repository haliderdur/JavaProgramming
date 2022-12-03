package day10_NestedIf;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {

 // pre-condition: if there is only one statement in the block
        int n = 10;
        String result = null;
        boolean a = n <= 12 && n >= 1;

        if (a)
            if (n == 1)
                result = "January";
            else if (n == 2)
                result = "February";
            else if (n == 3)
                result = "March";
            else if (n == 4)
                result = "April";
            else if (n == 5)
                result = "May";
            else if (n == 6)
                result = "June";
            else if (n == 7)
                result = "July";
            else if (n == 8)
                result = "August";
            else if (n == 9)
                result = "September";
            else if (n == 10)
                result = "October";
            else if (n == 11)
                result = "November";
            else if (n == 12)
                result = "December";

            else
                result = "Invalid";

        System.out.println(result);
    }
}
