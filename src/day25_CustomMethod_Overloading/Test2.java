package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        ArraysUtility.printEachElement(numbers);

        System.out.println("---------------");

        double[] decimals = {1.1, 2.5, 4.8};
        ArraysUtility.printEachElement(decimals);

        System.out.println("---------------");

        char[] characters = {'A', 'B', 'C'};
        ArraysUtility.printEachElement(characters);

        System.out.println("---------------");

        String[] cities = {"Barcelona", "Lisbon", "Istanbul", "London"};
        ArraysUtility.printEachElement(cities);

        System.out.println("---------------");

        int[] n1 = {15, 84, 56, 34, 8, 57};
        int max1 = ArraysUtility.max(n1);
        System.out.println(max1);

        System.out.println("---------------");

        double[] n2 = {2.5, 0.2, 4.56, 3.4, 5.8, 1.57};
        double max2 = ArraysUtility.max(n2);
        System.out.println(max2);

        System.out.println("---------------");

        int[] n3 = {15, 84, 56, 34, 7, 57};
        int min1 = ArraysUtility.min(n3);
        System.out.println(min1);

        System.out.println("---------------");

        double[] n4 = {2.5, 0.2, 4.56, 3.4, 5.8, 1.57};
        double min2 = ArraysUtility.min(n4);
        System.out.println(min2);

        System.out.println("---------------");

        int[] arr = {1,2,3,4,5,6,7,8,9};
        boolean result = ArraysUtility.contains(arr,6);
        System.out.println(result);

        System.out.println("---------------");

        char[] arr1 = {'A','B','C'};
        boolean result1 = ArraysUtility.contains(arr1,'D');
        System.out.println(result1);

        System.out.println("---------------");

        String[] arr2 = {"Lisbon", "Istanbul", "New York"};
        boolean result2 = ArraysUtility.contains(arr2,"Berlin");
        System.out.println(result2);

    }
}
