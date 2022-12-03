package day29_ArrayListContinue;

import java.util.ArrayList;

/*
Write a program that can return the first unique element from an ArrayList
Do not use indexOf&LastIndexOf methods
 */
public class FirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(60);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(30);
        numbers.add(10);
        System.out.println(numbers);

        for (Integer each : numbers) {
            int count = 0;

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("first unique element: " + each);
                break;
            }
        }
// Muhtar's solution
/*
        for (Integer each : numbers) {
            int count = 0;

            for (Integer element : numbers) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
                break;
            }
        }
 */

        //return the last unique element from an ArrayList
        for (int i = numbers.size() - 1; i >= 0; i--) {
            int count = 0;

            for (Integer each : numbers) {
                if (numbers.get(i) == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("last unique element: " + numbers.get(i));
                break;
            }
        }


    }

}
