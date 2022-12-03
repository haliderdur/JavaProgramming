package day17_While_DoWhile;
/*
    Write a program for login that allow users to enter their credentials.
    If credentials are correct, then print: "Login succeeded"
    If the password is incorrect consecutively 3 times, then print: "your account has been blocked".
        username: "Cydeo";
        password: "Cydeo123";
 */

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your username :");
        String username = scan.next();

        System.out.println("Please enter your password :");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) { // if credentials are valid
            System.out.println("Logged in");
        } else { // if credentials are NOT valid
            int attempt = 3;
            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempt > 0) { // while credentials are NOT valid, 3 times

                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Please enter your username :");
                username = scan.next();
                System.out.println("Please enter your password :");
                password = scan.next();

                attempt--;
            }
            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in");
            } else {
                System.out.println("Your account has been blocked");
            }
        }
        scan.close();

    }
}



