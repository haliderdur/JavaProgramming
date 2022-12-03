package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray2_Overloading {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        numbers = addElement(numbers, 5);
        System.out.println("Numbers = " + Arrays.toString(numbers));

        double[] arrDouble = {1.2, 2.1, 3.4};
        arrDouble = addElement(arrDouble, 9.9);
        System.out.println("Decimals = " + Arrays.toString(arrDouble));

        String[] names = {"Halid", "Fatih"};
        names = addElement(names, "Yavuz");
        System.out.println("Names = " + Arrays.toString(names));

        char[] characters = {'A', 'B', 'C'};
        characters = addElement(characters, 'H');
        System.out.println("Characters = " + Arrays.toString(characters));
    }


    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1]; // create a new array with the length of array and add 1 more index for new element

        int index = 0; // represents indexes of array

        for (int each : array) { // we need to get each element of array and add elements into the new array
            result[index] = each;
            index++; // after adding an element to the first index, then increase index number for next element
        }
        result[index] = element; // once we are outside of for each loop, our int element will be added to new array as its element

        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int index = 0;

        for (double each : array) {
            result[index++] = each;
        }
        result[index] = element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int index = 0;

        for (String each : array) {
            result[index] = each;
            index++;
        }
        result[index] = element;
        return result;
    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int index = 0;

        for (char each : array) {
            result[index++] = each;
        }
        result[index] = element;
        return result;
    }
}
