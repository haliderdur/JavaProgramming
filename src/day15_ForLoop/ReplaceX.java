package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

        System.out.println("Enter a word");

        String word = new Scanner(System.in).next();


        if (word.charAt(0) == 'x') {
            System.out.println(word.replaceFirst("x", "a"));
        } else if (word.charAt(0) == 'X') {
            System.out.println(word.replaceFirst("X", "Test"));
        } else {
            System.out.println(word);
        }

    }
}
