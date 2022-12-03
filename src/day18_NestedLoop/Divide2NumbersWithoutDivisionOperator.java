package day18_NestedLoop;

/*
Write a program that can divide 2 positive numbers without using (%)remainder, (/)division and (*)multiplication operator.

            20 / 6 == 3  with the remainder of 2

            a = 20;
            b = 6;

            a -= b; // a = 14
            a -= b; // a = 8
            a -= b; // a = 2
 */
public class Divide2NumbersWithoutDivisionOperator {
    public static void main(String[] args) {

        int a = 29;
        int b = 7;
        int count = 0; // to use for how many times we subtract b from a

        while (a >= b) { // we use while loop cuz we dont know how many times we need to repeat the loop.
                         // We only know that we need to repeat the loop till the numerator is less than the denominator
            a -= b;
            count++;
        }
        System.out.println(count + " with the remainder of " + a);

    }

}
