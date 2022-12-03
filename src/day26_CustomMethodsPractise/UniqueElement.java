package day26_CustomMethodsPractise;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {

        int[] array = {3, 4, 1, 5, 3, 1};
        int[] unique = uniqueElement(array);

        System.out.println(Arrays.toString(unique));

        double[] array2 = {3.5, 4.1, 1.2, 1.9, 5.1, 3.5, 1.2, 5.1};
        double[] unique2 = uniqueElement(array2);

        System.out.println(Arrays.toString(unique2));

        char[] array3 = {'A', 'B', 'A', 'C', 'B', 'D', 'A', 'B'};
        char[] unique3 = uniqueElement(array3);

        System.out.println(Arrays.toString(unique3));

        String[] array4 = {"ABC", "ZXC", "TR", "ABC", "ZXC", "PT", "ADS"};
        String[] unique4 = uniqueElement(array4);

        System.out.println(Arrays.toString(unique4));

        System.out.println("----------Unique Element from Scratch-----------");
        int[] array1 = {1, 1, 4, 6, 4, 8, 6, 5};

        for (int each : array1) {
            int frequency = 0;

            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == each) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(each);
            }
        }
        System.out.println("----------Unique Element from Scratch-----------");


    }

    //finds the unique elements of the array, returns new array
    public static int[] uniqueElement(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each); // then add the element into the dummy(result) array - addElement is custom method
            }
        }
        return result;
    }

    public static double[] uniqueElement(double[] array) {

        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each); // then add the element doubleo the dummy(result) array - addElement is custom method
            }
        }
        return result;
    }

    public static char[] uniqueElement(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each); // then add the element charo the dummy(result) array - addElement is custom method
            }
        }
        return result;
    }

    public static String[] uniqueElement(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each); // then add the element Stringo the dummy(result) array - addElement is custom method
            }
        }
        return result;
    }


}
