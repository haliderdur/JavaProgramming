package day26_CustomMethodsPractise;

import java.util.Arrays;

public class MergeArrays2 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9};

        int[] array3 = merge(array1, array2);
        System.out.println(Arrays.toString(array3)); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] result = new int[length]; // length: the capacity of new array that we want to return.

        int i = 0; // represents the index of array

        for (int each : arr1) { // to assign each element of array1 into the new array till the last index (everytime index increases by 1)
            result[i] = each;
            i++;
        }
        for (int each : arr2) { // to assign each element of array2 into the new array till the last index (everytime index increases by 1)
            result[i] = each;
            i++;
        }
        return result;
    }

    public static double[] merge(double[] arr1, double[] arr2) {
        int length = arr1.length + arr2.length;
        double[] result = new double[length]; // length: the capacity of new array that we want to return.

        int i = 0; // represents the index of array

        for (double each : arr1) { // to assign each element of array1 into the new array till the last index (everytime index increases by 1)
            result[i] = each;
            i++;
        }
        for (double each : arr2) { // to assign each element of array2 into the new array till the last index (everytime index increases by 1)
            result[i] = each;
            i++;
        }
        return result;
    }

    public static char[] merge(char[] arr1, char[] arr2) {
        int length = arr1.length + arr2.length;
        char[] result = new char[length]; // length: the capacity of new array that we want to return.

        int i = 0; // represents the index of array

        for (char each : arr1) { // to assign each element of array1 into the new array till the last index (everytime index increases by 1)
            result[i] = each;
            i++;
        }
        for (char each : arr2) { // to assign each element of array2 into the new array till the last index (everytime index increases by 1)
            result[i] = each;
            i++;
        }
        return result;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        int length = arr1.length + arr2.length;
        String[] result = new String[length]; // length: the capacity of new array that we want to return.

        int i = 0; // represents the index of array

        for (String each : arr1) { // to assign each element of array1 into the new array till the last index (everytime index increases by 1)
            result[i] = each;
            i++;
        }
        for (String each : arr2) { // to assign each element of array2 into the new array till the last index (everytime index increases by 1)
            result[i] = each;
            i++;
        }
        return result;
    }

}
