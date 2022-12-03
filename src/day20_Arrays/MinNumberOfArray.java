package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {100, 500, 300, 40, -60, 20, -90};

        int min = numbers[0]; // 100

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);

    }
}
