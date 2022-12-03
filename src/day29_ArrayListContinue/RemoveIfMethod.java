package day29_ArrayListContinue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

/*
remove()     =   when we remove one element. DO NOT use it in the loop
removeAll()  =   when we remove multiple elements. (If the elements that we want to remove are known)
retainAll()  =   when we want to keep multiple elements (If the elements that we want to retain are known)
removeIf()   =   when we want to remove elements under a condition
 */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // removeIf() = removes elements with the given condition. removeIf(p -> p > 5) ==> lambda expression
        // syntax ==> removeIf( p -> p + [logical/math operator] + element);
        list.removeIf(p -> p % 2 != 0); // remove if the element is odd
        list.removeIf(p -> p < 5); // remove if the element is less than 5
        list.removeIf(p -> p == 6); // remove if the element is 6

        System.out.println(list);

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list2.removeIf(each -> each % 2 == 0); // remove if the element is even
        System.out.println(list2);

        System.out.println("--------------------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "java", "Java"));

        list3.removeIf(p -> p.startsWith("J") || p.startsWith("j"));
        System.out.println(list3);

        System.out.println("--------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Python", "Level", "Eye", "Java", "Cydeo"));

        names.removeIf(name -> !StringUtility.isPalindrome(name));
        System.out.println(names);


    }


}
