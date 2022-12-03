package day26_CustomMethodsPractise;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int[] result = reverseArray(arr);
        System.out.println(Arrays.toString(result));

    }

    public static int[] reverseArray(int[] array) {
        int[] result = new int[array.length];
        int a = 0; // index of new array (result array)

        for (int i = array.length - 1; i >= 0; i--) {
            result[a] = array[i];
            a++;
        }
        return result;
    }

    public static double[] reverseArray(double[] array) {
        double[] result = new double[array.length];
        int a = 0; // index of new array (result array)

        for (int i = array.length - 1; i >= 0; i--) {
            result[a] = array[i];
            a++;
        }
        return result;
    }

    public static char[] reverseArray(char[] array) {
        char[] result = new char[array.length];
        int a = 0; // index of new array (result array)

        for (int i = array.length - 1; i >= 0; i--) {
            result[a] = array[i];
            a++;
        }
        return result;
    }

    public static String[] reverseArray(String[] array) {
        String[] result = new String[array.length];
        int a = 0; // index of new array (result array)

        for (int i = array.length - 1; i >= 0; i--) {
            result[a] = array[i];
            a++;
        }
        return result;
    }


}
