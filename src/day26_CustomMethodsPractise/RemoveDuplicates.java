package day26_CustomMethodsPractise;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        numbers = removeDuplicates(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] removeDuplicates(int[] array) {
        /* int[] result = {};
        int j = 0;

        for (int each : array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != each) {
                    result[j] = array[i];
                    j++;
                }
            }
            result[j] = array[each - 1];
            j++;
            for (int i = 0; i < j; i++) {
                array[i] = result[i];
            }
        } */

        /*        Arrays.sort(array);
                int j = 0;

                for (int i = 0; i < array.length - 1; i++) {

                    if (array[i] != array[i + 1]) {
                        array[j] = array[i];
                        j++;
                    }
                }
                array[j] = array[array.length - 1];
                for (int i = 0; i < j; i++) {
                    System.out.print(array[i] + " ");
                }

         */

        Arrays.sort(array);
        int a = 0; //

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] != array[i - 1]) {
                array[a] = array[i];
                a++;
            }
        }
        return Arrays.copyOf(array, a);

    }
}
