package utilities;

/*
Create a class called MathUtility under the utility package:
2.1 Create a method that can return the sum of two integers
2.2 Create a method that can return the sum of two decimal numbers
2.3 Create a method that can return the subtraction of two integers
2.4 Create a method that can return the subtraction of two decimals
2.5 Create a method that can return the multiplication of two integers
2.6 Create a method that can return the multiplication of two decimals
2.7 Create a method that passes two double parameters and return the division result
2.8 Create a method that can check if an integer is even number
2.9 Create a method that can check if an integer is odd number
2.10 Create a method that can return the maximum number between two integers
2.11 Create a method that can return the maximum number between two decimal numbers
2.12 Create a method that can return the minimum number between two integers
2.13 Create a method that can return the minimum number between two decimal numbers
2.14 Create a method that can return the square of an integer
            Ex: square(2) ==> 4
2.15 Create a method that can return the square of a double
2.16 Create a method that can return the cube of an integer
2.17 Create a method that can return the cube of a double
2.18 Create a method that can return the factorial of the given number
 */
public class MathUtility {

    // sum of 2 integers, returns int
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    // sum of 2 decimals, returns double
    public static double sum(double number1, double number2) {
        return number1 + number2;
    }

    // subtraction of 2 numbers, returns int
    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    // subtraction of 2 numbers, returns double
    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    // multiplication of 2 numbers, returns int
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    // multiplication of 2 numbers, returns double
    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    // division of 2 numbers, returns double-int
    public static int divide(int number1, int number2) {
        int result = number1 / number2;
        return result;
    }

    // division of 2 numbers, returns double-int
    public static double divide(double number1, double number2) {
        double result = number1 / number2;
        return result;
    }


    // checks if the given number is even or odd
    public static String evenOrOdd(int number) {
        String result = "";
        if (number % 2 == 0) {
            result = "" + number + " is even number";
        } else {
            result = "" + number + " is odd number";
        }
        return result;
    }

    // returns the maximum number between two integers
    public static int max(int number1, int number2) {
        int maxNumber = 0;
        if (number1 == number2) {
            System.err.println(number1 + " is equal to " + number2);
            System.exit(0);
        }
        if (number1 > number2) {
            maxNumber = number1;
        } else {
            maxNumber = number2;
        }
        return maxNumber;
    }

    // returns the maximum number between two decimals
    public static double max(double number1, double number2) {
        double maxNumber = 0;
        if (number1 == number2) {
            System.err.println(number1 + " is equal to " + number2);
            System.exit(0);
        }
        if (number1 > number2) {
            maxNumber = number1;
        } else {
            maxNumber = number2;
        }
        return maxNumber;
    }

    // returns the minimum number between two integers
    public static int min(int number1, int number2) {
        int minNumber = 0;
        if (number1 == number2) {
            System.err.println(number1 + " is equal to " + number2);
            System.exit(0);
        }
        if (number1 < number2) {
            minNumber = number1;
        } else {
            minNumber = number2;
        }
        return minNumber;
    }

    // returns the minimum number between two decimals
    public static double min(double number1, double number2) {
        double minNumber = 0;
        if (number1 == number2) {
            System.err.println(number1 + " is equal to " + number2);
            System.exit(0);
        }
        if (number1 < number2) {
            minNumber = number1;
        } else {
            minNumber = number2;
        }
        return minNumber;
    }

    // returns the square of integer
    public static int square(int number) {
        int square = number * number;
        return square;
    }

    // returns the square of decimal
    public static double square(double number) {
        double square = number * number;
        return square;
    }

    // returns the cube of integer
    public static int cube(int number) {
        int cube = number * number * number;
        return cube;
    }

    // returns the cube of decimal
    public static double cube(double number) {
        double cube = number * number * number;
        return cube;
    }

    // returns the factorial of given number, returns int
    public static int factorial(int number) {
        int factorial = 1;

        while (number > 0) {
            factorial *= number;
            number--;
        }
        return factorial;
    }


}
