package day18_NestedLoop;

import java.util.Scanner;

/*
Write a program for Login. Credentials are;
        username: Cydeo
        Password: WoodenSpoon

Ask the user to enter their credentials.
    If the creds are matched, print; "Logged in."
    if the creds are not matched, the program should allow the user to have three attempts to try
    if all three attempts are failed, print "Your account has been locked."
 */
public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scan.next();
        System.out.println("Enter your password:");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in.");
        } else {
            for (int i = 0; i < 3; i++) {
                System.err.println("Incorrect username or password!");
                System.out.println("Enter your username:");
                username = scan.next();
                System.out.println("Enter your password:");
                password = scan.next();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged in.");
                    break;
                }
            }
            if (!(username.equals("Cydeo") || password.equals("WoodenSpoon"))) {

                System.err.println("Your account has been locked.");
            }
        }
        scan.close();
    }
}

