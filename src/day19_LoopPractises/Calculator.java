package day19_LoopPractises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0);

        if (!(operator == '+' || operator == '-' || operator == '/' || operator == '*')) { // if the operator is not valid
            System.err.println("Invalid math operator: " + operator);
            System.exit(0); // terminates the entire program
        }

        System.out.println("Enter a number:");
        int num2 = scan.nextInt();

        if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 / num2);

        }
        scan.close();
    }
}
