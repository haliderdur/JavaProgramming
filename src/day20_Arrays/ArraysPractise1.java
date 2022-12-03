package day20_Arrays;

import java.util.Arrays;

public class ArraysPractise1 {
    public static void main(String[] args) {

        // store the elements: 10, 20, 50, 70

        int[] numbers = {10, 20, 50, 70};

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]); // 10
        System.out.println(numbers[1]); // 20
        System.out.println(numbers[2]); // 50
        System.out.println(numbers[3]); // 70

        System.out.println("-------------------------------------");

        // create a variable that can contain 5 scores

        int[] scores = new int[5];
        scores[2] = 60;
        scores[1] = 85;
        scores[0] = 95;
        scores[3] = 75;
        scores[scores.length - 1] = 50;  // scores[4]

        System.out.println(Arrays.toString(scores));

        System.out.println("-------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"}; // 0~11 (length -1)
/*
        System.out.println(months[0]); // Jan
        System.out.println(months[1]); // Feb
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);
*/
        for (int i = 0; i < months.length; i++) {  // Jan to December
            System.out.println(months[i]);
        }
        System.out.println("-------------------------------------");

        for (int i = months.length - 1; i >= 0; i--) { // December to Jan
            System.out.println(months[i]);
        }

    }
}
