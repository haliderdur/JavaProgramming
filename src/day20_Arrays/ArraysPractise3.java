package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractise3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();  // 5

        if (length <= 0) {
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int[] numbers = new int[length]; // [0, 0, 0, 0, 0]

        for (int i = 0; i < length; i++) { // i: 0, 1, 2, 3, 4
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt(); // 20, 15, 30, 12, 40
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();

    }
}
