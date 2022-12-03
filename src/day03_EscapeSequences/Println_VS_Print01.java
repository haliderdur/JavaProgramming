package day03_EscapeSequences;

public class Println_VS_Print01 {

    public static void main(String[] args) {

        System.out.println("Hello Cydeo");
        System.out.println("How is it going?");

        System.out.println("--------------------------");

        System.out.print("Thanks a lot ");
        System.out.print("for massive ");
        System.out.print("support");

        System.out.println("Java Programming");
        /*
        this "Java Programming" string is going to be appended in same line as the line above cuz previous line code is "print", not "println".
        always previous line code decides strings to be appended to whether in a different line or same line.
        */

        System.out.print("Wooden Spoon");  // this "Wooden Spoon" string is going to be appended in new line cuz the previous code is "println", not "print".


    }
}
