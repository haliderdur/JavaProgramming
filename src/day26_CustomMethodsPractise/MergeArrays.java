package day26_CustomMethodsPractise;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7};

        int[] array3 = merge(array1, array2);
        System.out.println(Arrays.toString(array3)); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;

    }
}
