package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // add(Data) = adds the data after the last index of the ArrayList
        // add(index, Data) = inserts the data at the given index and shifts the remaining indexes to the right

        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 3
        numbers.add(40); // 4
        numbers.add(50); // 6
        numbers.add(60); // 7

        numbers.add(2, 25); // 2
        numbers.add(5, 45); // 5
        System.out.println(numbers);


        System.out.println("--------------------------------------------------------");

        // size() = returns the total number of elements (length of ArrayList)
        System.out.println(numbers.size());

        System.out.println("Last index of ArrayList = " + (numbers.size() - 1));

        System.out.println("--------------------------------------------------------");

        // get(index) = returns the element at the given index
        int num = numbers.get(3); // Integer num = numbers.get(3); - unboxing
        System.out.println("num = " + num);


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("--------------------------------------------------------");

        // set(index, Data) = replaces the element at the given index element

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); // replace
        list.set(3, "C++");

        System.out.println(list);

        System.out.println("--------------------------------------------------------");

        // remove(int index) = removes the element at the given index, returns boolean
        // remove(Object) = removes the object from the arrayList, returns boolean

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Halid");
        employees.add("Akif");
        employees.add("Sema");
        employees.add("Fatih");
        employees.add("Tarik");
        employees.add("Yavuz");
        employees.add("Salim");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(1);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);

        employees.remove("Yavuz");
        System.out.println(employees);


    }


}
