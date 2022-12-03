package day16_ForLoopStringPractises;

import java.util.Scanner;
/*
Write a program that can reverse a String
        Ex:
            input:
            Wooden Spoon
            output:
            noopS nedooW
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String result = "";

        // word.length() - 1 ==> initializer --> to get last character of given word
        // word.indexOf(0) ==> condition --> to get first character of given word
        // i--  ==> decrement iterator --> to reverse the given word, we need to decrease characters from the end to the beginning of word
        for (int i = word.length() - 1; i > word.indexOf(0); i--) {
            result += word.charAt(i);  // += means adding each character to the result each time of the loop. this is concatenation (n+o+o+p+S+ +n+e+d+o+o+W)
        }
        System.out.println(result);
        input.close();
    }
}
