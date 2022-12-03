package day08_IfStatements;

/*
Create a class called EvenlyDivisible,and write a program that can
check if a number is evenly divisible by 2, 3, 5
Ex:
number = 65;
output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
 */

public class EvenlyDIvisible {
    public static void main(String[] args) {

        int number = 80;

        boolean isDivisibleBy_2 = number % 2 == 0; // if the remainder(%) of the number divided by 2 is 0, then it's evenly divisible by 2
        boolean isDivisibleBy_3 = number % 3 == 0; // if the remainder(%) of the number divided by 3 is 0, then it's evenly divisible by 3
        boolean isDivisibleBy_5 = number % 5 == 0; // if the remainder(%) of the number divided by 5 is 0, then it's evenly divisible by 5

        System.out.println(number + " is divisible by 2: " + isDivisibleBy_2);
        System.out.println(number + " is divisible by 3: " + isDivisibleBy_3);
        System.out.println(number + " is divisible by 5: " + isDivisibleBy_5);


    }
}
