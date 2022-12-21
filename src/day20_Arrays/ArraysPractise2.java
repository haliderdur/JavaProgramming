package day20_Arrays;

import java.util.Arrays;

public class ArraysPractise2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
/*
        letters[0] = 'Test';
        letters[1] = 'B';
 */
/*       for (int i = 0, j = 'Test'; i < letters.length; i++, j++) { // i: index numbers starting from 0 ~ last index
            letters[i] = (char) j;
        }
*/
        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch; // ch++;
            // ch++;
        }
        System.out.println(Arrays.toString(letters)); // [Test ~ Z]

        System.out.println("--------------------------------------------------");

        char[] letters2 = new char[26]; // [Z ~ Test]

        char ch2 = 'Z';
        for (int i = 0; i < letters2.length; i++, ch2--) {
            letters2[i] = ch2;
        }
        System.out.println(Arrays.toString(letters2));

    }
}
