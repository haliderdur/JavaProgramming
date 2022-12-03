package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

/*
1. Create an Array of String called country names

2. Write a program that can remove all the country names that have length of 10 or greater.
 */
public class ArrayListPractise1 {
    public static void main(String[] args) {

        String[] countries = {"Japan", "South Africa", "Portugal", "United States", "France", "United Kingdom", "Canada", "Netherlands"};

        // converting array to arrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length() >= 10);

        // converting arrayList to array
        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));

    }
}
