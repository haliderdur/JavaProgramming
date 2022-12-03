package day09_IfStatements;

public class MaxMinNumbers {
    /*
     Task 1. Max number between two different numbers
     Task 2. Min number between two different numbers
     */
    public static void main(String[] args) {

        int a = 30,
                b = 20;

        if (a > b) {
            System.out.println(a + " is the maximum number");
        } else {
            System.out.println(b + " is the maximum number");
        }
        if (a < b) {
            System.out.println(a + " is the minimum number");
        } else {
            System.out.println(b + " is the minimum number");
        }


    }
}
