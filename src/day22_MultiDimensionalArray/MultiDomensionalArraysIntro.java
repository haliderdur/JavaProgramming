package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDomensionalArraysIntro {
    public static void main(String[] args) {

/*
String[] group1 = {"John", "Mike", "James"};
String[] group2 = {"Alex", "Chris", "Eddie"};
String[] group3 = {"Shannon", "Fred", "Barry"};
*/
        String[] group1 = {"John", "Mike", "James"};
        String[] group2 = {"Alex", "Chris", "Eddie"};
        String[] group3 = {"Shannon", "Fred", "Barry"};

        String[][] groups = new String[3][]; // index: 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        //  System.out.println(Arrays.toString(groups)); // toString() method is for single dimensional Arrays
        System.out.println(Arrays.deepToString(groups)); // deepToString() method is for multi dimensional Arrays

        System.out.println("-----------------------------------------------------------------");
        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
         */

//  index of elements:    0  1  2    0  1  2  3    0  1   2  3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
//  index of Arrays:         0            1                2

        System.out.println(Arrays.deepToString(arr2D));

        // {4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1]));

        //11
        System.out.println(arr2D[2][3]);

    }
}
