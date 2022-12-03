package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9));

        ArrayList<Integer> unique1 = new ArrayList<>();

        for (Integer each : list1) {
            int frequency = Collections.frequency(list1, each);
            if (frequency == 1) {
                unique1.add(each);
            }
        }
        System.out.println(list1);
        System.out.println(unique1);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9));

        ArrayList<Integer> unique2 = new ArrayList<>(list2); // add all the elements of the list2

        unique2.removeIf(p -> Collections.frequency(list2, p) > 1);

        System.out.println(unique2);


    }
}
