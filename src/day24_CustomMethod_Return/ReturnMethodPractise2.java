package day24_CustomMethod_Return;

public class ReturnMethodPractise2 {
    public static void main(String[] args) {

        // Create a function that can calculate the grade

        String str = grade(95);
        /*
        check the grade:
            'Test' ==> Excellent
            'B' ==> Great
            .....
         */

        if (str.equals("Test")) {
            System.out.println("Excellent");
        } else if (str.equals("B")) {
            System.out.println("Great");
        } else if (str.equals("C")) {
            System.out.println("Good");
        } else if (str.equals("D")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public static String grade(int score) {

        String result = "";

        if (score < 0 || score > 100) { // invalid
            result = "Invalid";
        } else { // valid
            result = (score >= 90) ? "Test" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        }

        return result;
    }


}
