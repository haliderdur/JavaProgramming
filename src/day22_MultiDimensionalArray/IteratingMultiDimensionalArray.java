package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

//  index of elements:    0  1  2    0  1  2  3    0  1   2   3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
//  index of Arrays:         0            1                2

        for (int i = 0; i < arr2D.length; i++){ // i: index numbers of single dimensional Array

            System.out.println(Arrays.toString(arr2D[i]));

            for (int j = 0; j < arr2D[i].length; j++) { // j: index number of elements
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }


    }
}
