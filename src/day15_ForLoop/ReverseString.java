package day15_ForLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        /*
        Write a program that can reverse any given string

            String str = "Java";   ==> avaJ
                          0123
         */

        String name = new Scanner(System.in).nextLine();

        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            reverse += name.charAt(i);

        }

        System.out.println(reverse);


    }
}
