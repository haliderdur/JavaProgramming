package day25_CustomMethod_Overloading;

import java.util.Arrays;

/*
Task2:
    1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
            {1,2,3,4}, 5
            new array ==> {1,2,3,4,5}
    2. create a return method called addDouble that can add a double after the last index of a double array
    3. create a return method called addChar that can add a char after last index of a char array
    4. create a return method called addString that can add a String after the last index of a String array
 */
public class AddElementsToArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5); // {1,2,3,4,5}
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addDouble(arr2, 7.5); // {1.5, 2.5, 3.5, 4.5, 7.5}
        System.out.println(Arrays.toString(arr2));


        System.out.println("----------------------------------");

        String[] names = {"Halid", "Salim", "Tarik", "Fatih"};
        names = addString(names, "Yavuz"); // {"Halid", "Salim", "Tarik", "Fatih" , "Yavuz"}

        names = addString(names, "Nefise"); // {"Halid", "Salim", "Tarik", "Fatih" , "Yavuz", "Nefise"}
        System.out.println(Arrays.toString(names));

        System.out.println("----------------------------------");

        char[] arr3 = {'a', 'b', 'c'};
        arr3 = addChar(arr3, 'd'); // {'a','b','c','d'}
        System.out.println(Arrays.toString(arr3));

    }

    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1]; // create a new array with the length of array and add 1 more index for new element

        int index = 0; // represents indexes of array

        for (int each : array) { // we need to get each element of array and add elements into the new array
            result[index] = each;
            index++; // after adding an element to the first index, then increase index number for next element
        }
        result[index] = element; // once we are outside of for each loop, our int element will be added to new array as its element

        return result;
    }

    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int index = 0;

        for (double each : array) {
            result[index++] = each;
        }
        result[index] = element;
        return result;
    }

    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int index = 0;

        for (String each : array) {
            result[index] = each;
            index++;
        }
        result[index] = element;
        return result;
    }

    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int index = 0;

        for (char each : array) {
            result[index++] = each;
        }
        result[index] = element;
        return result;
    }
}
