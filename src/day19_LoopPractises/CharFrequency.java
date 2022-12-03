package day19_LoopPractises;

/*
WWrite a program that can find the frequency of the characters
        Ex
            str = "aabcccd";
        Output: a2b1c3d10
 */
public class CharFrequency {
    public static void main(String[] args) {

        String str = "aaaabcccccdd";

        String result = "";  // a4b1c5d2

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);  // each character from string

            int count = 0;

            for (int i = 0; i < str.length(); i++) {  // to find the frequency of each character
                char each = str.charAt(i);  // each character of str
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
            result += count;
        }
        System.out.println(result);











  /*
        char ch = 'a';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            frequency++;
            while (ch == eachChar) {
                System.out.println(eachChar + frequency);
            }
        }
        System.out.println(frequency);
 */

    }
}
