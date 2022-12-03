package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 2, 1, 2, 3, 2, 2, 4, 3, 2, 3, 1, 3, 3, 1, 3, 4, 4, 3, 4, 3, 2};
        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"Ruby", "Java", "C++", "Ruby", "Java", "C++", "C++", "Java", "Python", "Python", "Ruby", "Java", "C++", "C++", "Java", "Python"};
        arr2 = removeDuplicates(arr2);

        System.out.println(Arrays.toString(arr2));
    }


    public static int[] removeDuplicates(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static double[] removeDuplicates(double[] array) {

        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static char[] removeDuplicates(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static String[] removeDuplicates(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }
}
