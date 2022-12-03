package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 1, 8, 3, 9, 2, 7, 0, 6};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); // sorts the array in ascending order

        System.out.println(Arrays.toString(numbers));
    }
}
