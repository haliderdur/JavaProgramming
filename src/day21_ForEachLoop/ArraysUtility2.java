package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

// copyOf(array, newLength);
//      ==> Copies the elements of Array, starting from first index until the given index, returns new array

        String[] students = {"Alan", "Lucie", "Halid", "Lori", "John", "Gunay", "David", "Alex", "Judith"};
        String[] earlyBirds = Arrays.copyOf(students, 4);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        numbers = Arrays.copyOf(numbers, 5); // 1, 2, 3, 4, 5

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------------------------------------------");

// copyOfRange(array, starting index, ending index);
//      ==> Copies the elements of Array, starting from given beginning element until the given ending index, returns new array

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6);

        System.out.println(Arrays.toString(ch2));

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] result = Arrays.copyOfRange(scores, 3, 8); // 40....80

        System.out.println(Arrays.toString(result));
    }
}
