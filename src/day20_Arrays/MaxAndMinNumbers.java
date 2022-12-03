package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();  // each user entered input will be assigned to the indexes of the array numbers
        }

        int max = numbers[0]; // assumption
        int min = numbers[0]; // assumption

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        scan.close();
    }
}
