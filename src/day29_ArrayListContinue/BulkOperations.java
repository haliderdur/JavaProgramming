package day29_ArrayListContinue;

/*
Bulk Operations: argument MUST be a collection type
    addAll(CollectionType): adds collection of values to the arrayList
    removeAll(CollectionType): removes all the matching elements from the arraylist
    retainAll(CollectionType): removes all the non-matching elements from the arraylist
    containsAll(CollectionType): checks if all the elements are contained in the arraylist

Arrays:
    asList(array of values) ===> returns the array as collectionType
*/

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        // addAll() = Adds elements into the arrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(list);

        // removeAll() = removes the matching elements from the arrayList
        list.removeAll(Arrays.asList(1, 2, 3));
        System.out.println(list);

        // retainAll() = removes the un-matching elements from the arrayList [keeps the matching elements]
        list.retainAll(Arrays.asList(6, 7, 8));
        System.out.println(list);

        System.out.println("----------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "Scrum Master", "SDET", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);

        System.out.println("----------------------------------------");

        // containsAll() = Checks whether if the all elements are contained by the ArrayList. If one of them is not contained, then return will be false
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 8, 9, 10));

        boolean r1 = numbers.contains(5);
        boolean r2 = numbers.contains(5) && numbers.contains(7) && numbers.contains(10);

        boolean r3 = numbers.containsAll(Arrays.asList(5, 7, 10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("----------------------------------------");

        String[] names = {"Halid", "Akif", "Fatih", "Ozgur", "Yavuz", "Salim", "Tarik", "Kerem"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
/*
        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
*/
        System.out.println(nameList);

        System.out.println("----------------------------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(nums));

        System.out.println(numList);

        System.out.println("----------------------------------------");

        int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        ArrayList<Integer> list2 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println(list2);
    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
