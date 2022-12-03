package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n = 0;

// Single if statement
        if (n > 0) {
            System.out.println("Positive");
        }
        if (n < 0) {
            System.out.println("Negative");
        }
        if (n == 0) {
            System.out.println("Zero");
        }

        System.out.println("----------------");

// multi-branch if statement
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else if (n == 0) {
            System.out.println("Zero");
        }

        System.out.println("-----------------");

// multi-branch if statement

        boolean positive = n > 10;
        boolean negative = n < 0;

        if (positive) {
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
// if & else statement, we can never apply if we have more than 2 different conditions