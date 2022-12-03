package utilities;

import java.util.Arrays;

public class StringUtility {

    // brings each character of given String
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    // brings reversed version of given String
    public static String reverse(String str) { // "Java"
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result; // "avaJ"
    }

    // checks if the given String is palindrome, returns boolean
    public static boolean isPalindrome(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }

    // checks if the given String is anagram, returns boolean
    public static boolean isAnagram(String str1, String str2) { // "acb" , "bac"
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.toString(ch1);
        Arrays.toString(ch2);

        return Arrays.equals(ch1, ch2);

    }

    // removes the duplicates from the given String, returns String "acaacababc" --> "abc"
    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) { // a
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }
        }
        return result;
    }


    // checks whether if the given password is strong or not, returns boolean
    public static boolean isStrongPassword(String password) {
        boolean r1 = password.length() >= 8 && !password.contains(" "); // has at least 8 character and does not contain space
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // has special character
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray(); // to use for-each loop, convert the String to char array
        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (!Character.isLetterOrDigit(each)) {
                r4 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            }
            if (r2 && r3 && r4 && r5) {
                break;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }


}
