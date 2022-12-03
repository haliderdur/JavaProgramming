package day17_While_DoWhile;

/*
Write a program that can return the frequency of a char from a String
        Ex:
            input:
                str = "AAABBBC"
                ch = 'A'
            output:
                3
 */
public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBAACAAACCBAABBBBCAA";

        char ch = 'A';
        int frequency = 0;  // +1+1+1 ==> 3

        for (int i = 0; i < str.length(); i++) {  //  indexes of str
            char eachChar = str.charAt(i);   //  eachChar: each character of str

            if (ch == eachChar) {  // if given char is matching with the eachChar, then ch is appeared in String
                frequency++;
            }

        }
        System.out.println(frequency);


    }
}
