package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 45.3,
                n2 = 32.8;

        char operator = '*';

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if (valid) {
            switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n1);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                case '/':
                    System.out.println(n1 * n2);
                    break;
            }

        } else {
            System.out.println("Invalid Operator" + operator);
        }


    }
}
