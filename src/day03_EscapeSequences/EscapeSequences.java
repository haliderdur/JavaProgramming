package day03_EscapeSequences;

/*
escape sequences: Must be given with double quote
    /n: starts a new line
    /t: horizontal tab - paragraph space (tab button in keyboard)
    //: single backward slash
    \": double quote
 */
public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java Phyton C++");

        System.out.println("--------------------------------");

        System.out.println("Java \nPhyton \nC++");

        System.out.println("--------------------------------");

        System.out.println("\tJava is cool programming language");

        System.out.println("--------------------------------");

        System.out.println("/ \\");     // in order to print one backward slash, we need to write 2 backward slashes

        System.out.println("--------------------------------");

        System.out.println("My favorite TV show is \"Game of Thrones\""); // in order to print double quote, we need to use \"


    }

}
