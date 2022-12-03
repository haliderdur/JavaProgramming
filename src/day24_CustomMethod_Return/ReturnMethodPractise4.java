package day24_CustomMethod_Return;

public class ReturnMethodPractise4 {
    public static void main(String[] args) {
// create a method that can remove the duplicate characters from the String and returns the new value
        //  "aaaabbbcc"  ==>  "abc"

        String str = "aaaaaaabbbbbddddddaaaaccccc";

        str = removeDuplicates(str);
        System.out.println(str);

    }

    public static String removeDuplicates(String str) { // "aaaabbbcc"  ==>  "abc"
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }
        }
        return result;

    }
}
