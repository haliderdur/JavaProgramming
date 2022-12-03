package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    /*
    + addition
    - subtract
    * multiplication
    / division
  integer / integer = integer
  integer / decimal = decimal
  decimal / integer = decimal
  decimal / decimal = decimal

            in math:
                10/4 = 2.5
                10/3 = 3.333...

            in java:
                10/4 = 2
                10.0/4 = 2.5
                10/3 = 3
    % remainder
     */
    public static void main(String[] args) {

        System.out.println("10" + 20); // 1020 concatenation
        System.out.println(10 + 20);   // 30 addition
        System.out.println(100 - 50);  // 50 subtraction
        System.out.println(100 * 6);     // 600 multiplication

        System.out.println(100 / 3);  // 33
        System.out.println(10 / 4);   // 2 (in math, result must be 2.5)
        System.out.println(10.0 / 4);  // 2.5
        System.out.println(10 / 4.0);  // 2.5
        System.out.println(10d / 4);  // 2.5  ("d" represents decimal)
        System.out.println(10 / 4d);  // 2.5  ("d" represents decimal)
        System.out.println((double) 10 / 4);  // 2.5
        System.out.println("-------");
// what if we have larger numbers
        int a = 100;
        double b = a / 6;
        //a and 6 are integer but assigned to double which is decimal
        // so implicit casting with decimal primitive (double), the given result will be decimal
        System.out.println(b);
        System.out.println(100 / 6);
// to get 16.666...
        double c = a / 6.0;
        // or double c = a / 6d;
        // or double c = (double)a / 6;
        System.out.println(c);


    }
}
