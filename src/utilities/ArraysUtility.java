package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each element of an Array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    // returns the max number of an Array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // returns the min number of an Array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
        /* finding max&min numbers of Array without sort method

        int max = numbers[0]; // assumption
        int min = numbers[0]; // assumption
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
         */
    }


    //checks if the given element is contained in the given Array, returns boolean -- contains(int[] , int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;

        for (int each : array) {
            if (each == element) { // if any arrays element matches with the given element, means that the give elements is contained by the array
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(double[] array, double element) {
        boolean result = false;

        for (double each : array) {
            if (each == element) { // if any arrays element matches with the given element, means that the give elements is contained by the array
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(char[] array, char element) {
        boolean result = false;

        for (char each : array) {
            if (each == element) { // if any arrays element matches with the given element, means that the give elements is contained by the array
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(String[] array, String element) {
        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) { // if any arrays element matches with the given element, means that the give elements is contained by the array
                result = true;
            }
        }
        return result;
    }


    // adds the given new element to the array, returns new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1]; // create a new array with the length of array and add 1 more index for new element

        int index = 0; // represents indexes of array

        for (int each : array) { // we need to get each element of array and add elements into the new array
            result[index] = each;
            index++; // after adding an element to the first index, then increase index number for next element
        }
        result[index] = element; // once we are out of for each loop, our int element will be added to new array as its element

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


    // Finds the frequency of the given element from the array, returns frequency (int)
    public static int frequencyOfElement(int[] array, int element) {

        int frequency = 0;

        for (int each : array) {
            if (element == each) {
                frequency++;
            }
        }
        return frequency;
    }

    public static int frequencyOfElement(double[] array, double element) {

        int frequency = 0;

        for (double each : array) {
            if (element == each) {
                frequency++;
            }
        }
        return frequency;
    }

    public static int frequencyOfElement(char[] array, char element) {

        int frequency = 0;

        for (char each : array) {
            if (element == each) {
                frequency++;
            }
        }
        return frequency;
    }

    public static int frequencyOfElement(String[] array, String element) {

        int frequency = 0;

        for (String each : array) {
            if (element.equals(each)) {
                frequency++;
            }
        }
        return frequency;
    }


    // finds the unique elements of the array, returns new array
    public static int[] uniqueElement(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each); // then add the int element into the dummy(result) array - addElement is custom method
            }
/*
for (int each : array) {
  int frequency = 0;

    for (int i = 0; i < array.length; i++) {
        if (array[i] == each) {
        frequency++;
       }
    }
    if (frequency == 1) {
        System.out.println(each);
       }
}
*/
        }
        return result;
    }

    public static double[] uniqueElement(double[] array) {

        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each); // then add the double element into the dummy(result) array - addElement is custom method
            }
        }
        return result;
    }

    public static char[] uniqueElement(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each); // then add the char element into the dummy(result) array - addElement is custom method
            }
        }
        return result;
    }

    public static String[] uniqueElement(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each); // then add the String element into the dummy(result) array - addElement is custom method
            }
        }
        return result;
    }


    // removes the given index from the array, returns a new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) { // i: array index number  -- index: given index number that we want to remove from th array
            if (i == index) { // if the index of array matches with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) { // i: array index number  -- index: given index number that we want to remove from th array
            if (i == index) { // if the index of array matches with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) { // i: array index number  -- index: given index number that we want to remove from th array
            if (i == index) { // if the index of array matches with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) { // i: array index number  -- index: given index number that we want to remove from th array
            if (i == index) { // if the index of array matches with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }


    // merges 2 arrays into a new array, returns new array
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


    // reverse Array, returns a new array
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


    // Replaces the elements of array at the given index with the new element, returns array
    public static int[] replace(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }

    public static double[] replace(double[] array, int index, double newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }

    public static char[] replace(char[] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }

    public static String[] replace(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }


    // replaces all matching elements with the given element.  returns array
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
            }
        }
        return array;
    }


    // removes duplicate elements from the array, return array
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
