package day17_While_DoWhile;

import java.util.Scanner;

/*
Write a program for the marriage proposal; user asking "Will you marry me?"
    if the answer is YES, print "Congrats"
    if the answer is NO, print "Goodbye"
    if the answer is neither YES nor NO, "Invalid answer, please re-enter" and repeat it until user enters a valid answer
 */
public class MarriageProposal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me? Yes/No");
        String answer = scan.nextLine().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid answer, please re-enter");
            answer = scan.nextLine().toLowerCase();
        }
        if (answer.equals("yes")) {
            System.out.println("Congrats");
        } else {
            System.out.println("Goodbye");
        }

        scan.close();
    }
}
