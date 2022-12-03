package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
// regular for Loop
        for (int i = 0; i < numbers.length; i++) { // i: indexes of the Array
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }
        System.out.println("-------------------------------------------");
// for each Loop
        for (int each : numbers) { // each: elements of the Array
            System.out.println(each);
        }

    }
}
