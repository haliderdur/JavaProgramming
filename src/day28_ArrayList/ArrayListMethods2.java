package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        /*
        int num = 1;
        list.remove(num); // num is index
        System.out.println(list);
         */

        Integer num = 200;   // num is an object
        boolean r = list.remove(num);
        System.out.println(list);
        System.out.println(r);

        System.out.println("--------------------------------------------------------");

        // clear() = removes all elements from the arrayList, size will be 0

        System.out.println(list.size());

        list.clear();
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("--------------------------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); // 0
        int b = characters.lastIndexOf('A'); // 4

        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------------------------------------");

        // contains() = checks if the element is contained by the arrayList, returns boolean

        boolean r1 = characters.contains('A');
        boolean r2 = characters.contains('Z');

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("--------------------------------------------------------");

        // equals(ArrayList) = returns true if two arrayLists are equal (same elements in same order), otherwise returns false

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // always gives false cuz we are not comparing arraylists, we want to compare the contained elements and their order
        System.out.println(list1.equals(list2)); // same elements in same order --> true

        System.out.println("--------------------------------------------------------");

        // isEmpty() = checks whether if the arraylist is empty or not, returns boolean

        list1.clear();
        boolean r4 = list1.isEmpty(); // true
        System.out.println("r4 = " + r4);

        System.out.println("--------------------------------------------------------");

        // addALl() = bulk operation to add elements to the arrayList.
        // Every bulk operation needs a collectionType(such as; asList)

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(numbers);


    }
}
