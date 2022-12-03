package day03_EscapeSequences;

public class Println_VS_Print02 {

    public static void main(String[] args) {

        System.out.println("Knock Knock");
        System.out.println("Who is this?");
        System.out.println("This is Java");

        System.out.println("------------------------------------");

        System.out.print("Knock Knock");
        System.out.print("Who is this?");
        System.out.print("This is Java");

        System.out.println();
        System.out.println("------------------------------------");


        System.out.println("Hello all, how are you today? Today we will learn escape sequences, and next week we will learn variables. In a short time you all will be a master of Java because we will do tons of practises.");
        // OR
        System.out.print("Hello all, how are you today? ");
        System.out.print("Today we will learn escape sequences, ");
        System.out.print("and next week we will learn variables. ");
        System.out.print("In a short time you all will be a master of Java ");
        System.out.print("because we will do tons of practises.");
        // To make the source-code easily readable, we can divide long "println" statement to short "print" statement

    }

}