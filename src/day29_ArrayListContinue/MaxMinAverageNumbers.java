package day29_ArrayListContinue;

import java.util.ArrayList;

/*
Write a program that can find the max, min and average number from an ArrayList
 */
public class MaxMinAverageNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(64);
        numbers.add(16);
        numbers.add(20);
        numbers.add(75);
        numbers.add(82);
        numbers.add(40);
        numbers.add(33);
        numbers.add(51);
        System.out.println(numbers);

        int max = numbers.get(0);
        int min = numbers.get(0);
        int sum = 0;
        double average = 0;

        for (Integer each : numbers) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
            sum += each;
            average = (double) sum / numbers.size();
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);
    }
}
