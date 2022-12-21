package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility1 {
    public static void main(String[] args) {

// toString(array)  ==> Converts the Array object(single dimensional Array) to a String, returns String
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(nums);  // gonna print hashcode

        System.out.println(Arrays.toString(nums)); // toString prints entire Array

        System.out.println(nums[0]); // to print an element of Array

        /*
        String str = "java";
        System.out.println(str); // java
        System.out.println(str.toString()); // java
         */
        System.out.println("-------------------------------------------------------------------");

// sort(array) ==> Sorts the Array in ascending order
//            ascending order : smallest to largest  1 to 10 || Test to Z
        int[] scores = {85, 90, 10, 65, 75}; // [10.....90]
        System.out.println(Arrays.toString(scores)); // [85, 90, 10, 65, 75]

        Arrays.sort(scores);  // [10, 65, 75, 85, 90]
        System.out.println(Arrays.toString(scores));

        System.out.println("Min score: " + scores[0]);
        System.out.println("Max score: " + scores[scores.length - 1]);

        String[] names = {"Anna", "Gunay", "Ahmet", "Gabriel", "Lucie", "Leila", "Zoe"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); // sorts the names in alphabetic order according to ASCII table || Test to Z

        System.out.println("-------------------------------------------------------------------");

// equals(array1, array2) ==> checks if two arrays are equal, returns boolean
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 1, 2};

        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1); // false

        Arrays.sort(arr1); // {1, 2, 3}
        Arrays.sort(arr2); // {1, 2, 3}

        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2); // true

        System.out.println("-------------------------------------------------------------------");

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1); // a,b,c
        Arrays.sort(ch2); // a,b,c

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("anagram = " + anagram);


    }
}
