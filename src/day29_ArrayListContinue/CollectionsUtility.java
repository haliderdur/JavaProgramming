package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        // sort() = sorts arrayList elements in ascending order
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 1, 5, 2, 7, 4, 6, 9, 10, 8));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println("------------------------------------------------");

        // reverse() = reverses the arrayList elements.
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("------------------------------------------------");

        // swap() = swaps elements within the arrayList
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list3);

        Collections.swap(list3, 4, 1);
        System.out.println(list3);

        System.out.println("------------------------------------------------");

        // max() and min() = to find max and min numbers in arrayList
        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("------------------------------------------------");

        // replaceAll() = replaces the given old element with the given new element in arrayList
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 10, 10, 10));

        Collections.replaceAll(list4, 10, 100);
        System.out.println(list4);

        System.out.println("------------------------------------------------");

        // frequency() = returns the frequency of given element from arrayList

        int frequency = Collections.frequency(list4, 100);
        System.out.println("frequency = " + frequency);

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));

        int countJava = Collections.frequency(words, "Java");
        int countPython = Collections.frequency(words, "Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
    }
}
