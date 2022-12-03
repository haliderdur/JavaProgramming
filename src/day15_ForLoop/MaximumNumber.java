package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        /*
        Write a program that asks the user to enter a number for 5 times
        return the maximum number
         */


        Scanner input = new Scanner(System.in);
        int max = -2147483648;  // any number that user enter will be greater than the smallest int number

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");

            int num = input.nextInt();

            if (num > max) {
                max = num;
            }

        }
        System.out.println("max = " + max);

        input.close();

    }
}
