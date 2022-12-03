package day26_CustomMethodsPractise;

import java.util.Arrays;

/*
2.1 Create a method that passes two parameters: an integer array and an integer index. the method removes the
element at the given index of the array and returns the new array
            Ex:
            int[] arr =
            {10,20,30,40}
            removeElement(arr, 2) ==> {10, 20, 40}

2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the
element at the given index of the array and returns the new array

2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the
element at the given index of the array and returns the new array

2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the
element at the given index of the array and returns the new array
 */
public class RemoveElements1 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 3, 4};

        arr = removeElement(arr, 1);
        System.out.println(Arrays.toString(arr));

        double[] arr1 = {1.5, 6.2, 2.2, 3.6, 4.8};

        arr1 = removeElement(arr1, 4);
        System.out.println(Arrays.toString(arr1));

        char[] arr2 = {'A', 'B', 'C', 'D', 'E'};

        arr2 = removeElement(arr2, 3);
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = {"Lisbon", "Krakow", "Madrid", "London", "Paris"};

        arr3 = removeElement(arr3, 3);
        System.out.println(Arrays.toString(arr3));
        
        
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

}
