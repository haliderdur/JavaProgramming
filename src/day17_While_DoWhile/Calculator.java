package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char ch = scan.next().charAt(0);

        while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            // if operator is not '+' nor '-', then print out Invalid operator. [ (!) at the beginning of boolean]
            System.err.println("Invalid Operator, Please re-enter");
            ch = scan.next().charAt(0);
        }
        if (ch == '+') {
            System.out.println(num1 + num2);
        } else if (ch == '-') {
            System.out.println(num1 - num2);
        } else if (ch == '*') {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 / num2);
        }
        scan.close();
    }
}
