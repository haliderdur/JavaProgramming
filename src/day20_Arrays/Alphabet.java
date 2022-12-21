package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        // Create a variable that can contain 26 characters. We do not know the characters

        char[] alphabet = new char[26]; // store characters. Z ~ Test
/*               i     ch     ASCII
        alphabet[0] = 'Z';  // 90
        alphabet[1] = 'Y';  // 89
        alphabet[2] = 'X';  // 88
*/
        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++, ch--) {
            alphabet[i] = ch;
        }

        System.out.println(Arrays.toString(alphabet));  // prints the entire array
        // System.out.println(alphabet[0]);  // prints the element of Array


    }
}
