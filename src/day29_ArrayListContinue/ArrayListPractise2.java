package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractise2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali", "David", "Ahmet", "Jimmy", "Daniel", "Ahmet", "Shay", "David"));

        employees.retainAll(Arrays.asList("Ahmet", "David"));

        System.out.println(employees);

        System.out.println("--------------------------------------------------------------");

        // remove the names which starts with M from the array
        String[] names = {"Michael", "Tony", "Monica", "Jackson", "Mustafa", "Alex", "Hasan", "Mehmet"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        nameList.removeIf(name -> name.charAt(0) == 'M'); // can be also (p -> p.startsWith("M"))
        names = nameList.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

    }
}
