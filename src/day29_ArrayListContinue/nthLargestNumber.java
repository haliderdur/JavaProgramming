package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Write a program that can return the nth largest number from an arrayList.
do not use sort method.

        arrayList = {1,2,3,3,4,5,6,7,7,8,8}
            n = 5
        output:
            6
 */
public class nthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8));

        int n = 3;

        for (int i = 1; i < n; i++) {
            list.removeIf(p -> Collections.max(list) == p);
        }
        int max = Collections.max(list);
        System.out.println(max);

    }


}
