package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        // write a program that can check whether if str1 and str2 were build out of same characters

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        System.out.println();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram = Arrays.equals(ch1, ch2);
        System.out.println("Anagram = " + isAnagram);


    }
}
