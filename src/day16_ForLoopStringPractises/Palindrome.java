package day16_ForLoopStringPractises;

import java.util.Scanner;

/*
Java ==> avaJ  --> false (not palindrome)
Level ==> leveL --> true (palindrome)
Anna ==> annA --> true
Racecar ==> racecaR --> true
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (reversed.equalsIgnoreCase(word)) {
            System.out.println("\"" + word + "\"" + " is palindrome: \"" + reversed + "\"");
        } else {
            System.out.println("\"" + word + "\"" + " is not palindrome: \"" + reversed + "\"");
        }

        scan.close();
    }
}
