package day17_While_DoWhile;

/*
    Write a program for login that allow users to enter their credentials.
    If credentials are correct, then print: "Login succeeded"
    If the password is incorrect consecutively 3 times, then print: "your account has been blocked".
        username: "Cydeo";
        password: "Cydeo123";
 */

import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        for (int i = 1; i <= 3; i++) {
            System.out.println("Please enter your username :");
            String username = scan.next();
            System.out.println("Please enter your password :");
            String password = scan.next();

            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged In");
                break;
            } else if (!(username.equals("Cydeo")) || !(password.equals("Cydeo123"))) {
                System.err.println("Incorrect username or password");
            }
            if (i == 3) {
                System.out.println("Your account has been blocked");
            }

        }
        scan.close();


    }
}
