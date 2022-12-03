package day34_GarbageCollection_AccessModifiers;

import day32_ConstructorOverloading.Car;
import day32_ConstructorOverloading.day30_CustomClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {

        String str = "Wooden Spoon"; // after line 7, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println(str);

        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println(car1);
        System.out.println("------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        System.out.println("------------------------------------");

        String language = "Python";
        language = "Java";

        System.out.println(language);

        System.out.println("------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1 == list2);

        System.out.println("------------------------------------");



    }
}