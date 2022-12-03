package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);
        StringUtility.reverse(str);

        System.out.println("----------------------------------------");

        String s1 = "Wooden Spoon";
        String reversed = StringUtility.reverse(s1);
        System.out.println(reversed);

        System.out.println("----------------------------------------");

        String word = "Anna";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("Palindrome: " + palindrome);

        System.out.println("----------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo", "Halid"};
        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("----------------------------------------");

        String s2 = "abbcabbbbcccaaaaaacaaaaaabbbcccccccabc";
        String nonDuplicate = StringUtility.removeDuplicates(s2);
        System.out.println(nonDuplicate);




    }




}
