package day09_IfStatements;

public class MedianNumber {
/*
    Create a class called MedianNumber. write a program that can find
    the median number between three DIFFERENT given integers
    Ex:
        a = 10, b= 15, c = 20;
    Output:
        15 is the median number
            Possibility #1: a could be median number
            Possibility #2: b could be median number
            Possibility #3: c could be median number
 */

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b),
                bIsMedian = (b > a && b < c) || (b > c && b < a),
                cIsMedian = (c > a && c < b) || (c > b && c < a); // cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            System.out.println(a + " is median number");
        }
        if (bIsMedian) {
            System.out.println(b + " is median number");
        }
        if (cIsMedian) {
            System.out.println(c + " is median number");
        }


    }

}
