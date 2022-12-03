package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(123);
        System.out.println("-------------------");
        ageOfPerson(2022, 1989);
        System.out.println("-------------------");
        numbersBetweenXandY(12,17);

    }

    // create a function that can check whether if the given number is even or odd
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    // create a function that can display the age of the person
    public static void ageOfPerson(int currentYear, int birthYear) {

        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
    }

    // create a function that can print all the numbers between X and Y
    public static void numbersBetweenXandY(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }
    }
}
