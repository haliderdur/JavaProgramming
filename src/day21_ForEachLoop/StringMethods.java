package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
/*
        String str = "Java";

        for (char each : str.toCharArray()) {
            System.out.println(each);
        }
 */
        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));  // [J, a, v, a]

        for (char each : chars) {
            System.out.println(each);
        }
        System.out.println("-----------------------------------------------");

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------------");

        String s = "Today is a nice day. Today is Wednesday. Java is cool";

        String[] sentences = s.split("\\. "); // only for dot, we need to use double slash special character.
        System.out.println(Arrays.toString(sentences));

    }


}
