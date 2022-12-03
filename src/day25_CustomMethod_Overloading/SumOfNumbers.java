package day25_CustomMethod_Overloading;

/*
Warmup tasks:
Task1:
    1. create a method that can find the sum of two numbers
                    method name: sumOf2Numbers
    2. create a method that can find the sum of three numbers
                    method name: sumOf3Numbers
    3. create a method that can find the sum of four numbers
                    method name: sumOf4Numbers
Task2:
1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
{1,2,3,4}, 5
new array ==> {1,2,3,4,5}
    2. create a return method called addDouble that can add a double after the last index of a double array
    3. create a return method called addString that can add a String after the last index of a String array
    4. create a return method called addChar that can add a char after last index of a char array
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        int sum2 = sumOf2Numbers(5, 10);
        System.out.println("sum2 = " + sum2);

        int sum3 = sumOf3Numbers(5, 10, 15);
        System.out.println("sum3 = " + sum3);

        int sum4 = sumOf4Numbers(5, 10, 15, 20);
        System.out.println("sum4 = " + sum4);
    }

    public static int sumOf2Numbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }


}
