package day16_ForLoopStringPractises;

/*
Write a program that can remove the duplicated characters from a String
Ex:
    input:
        aabbccaacc
    output:
        abc
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbacccaabbdddcc";

        String result = ""; // abc

        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i);  // represents each character of str

            if (!result.contains(ch)) { // if the result does not contain the character(!result.contains)-[at each time of loop,this condition will be checked]
                result += ch; // the character will be added to the result
            }

        }
        System.out.println(result);

    }
}
