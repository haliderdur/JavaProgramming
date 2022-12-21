package day32_ConstructorOverloading.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
1. Write a program that can swap the first and last elements of an ArrayList

2. Write a program that can move all the zeros to the last indexes of ArrayList
        Ex:
            list:{1,0,2,0,3,0,4,0}
        Output:
            [1,2,3,4,0,0,0,0]
3. Write a program that can extract the special characters, digits and letters from a String and store them in separate Arraylists of Characters.
        Ex:
            str = {"ABCD123#$%@456EFG!&"}
        Output:
            list1:{1,2,3,4,5,6}
            list2:{Test,B,C,D,E,F,G}
            list3:{#,$,%,@,!,&}
 */
public class WarmUpTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Collections.swap(numbers, 0, numbers.size() - 1);
        System.out.println(numbers);

        System.out.println("------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        int countZero = 0;
        for (Integer element : list) {
            if (element == 0) {
                countZero++;
            }
        }
        list.removeAll(Arrays.asList(0));
        for (int i = 0; i < countZero; i++) {
            list.add(0);
        }

        System.out.println(list);

//  Another solution with new ArrayList ------------------------------------------
/*
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) { // to add non-zero elements to the new arrayList
            if (each != 0) {
                result.add(each);
            }
        }
        for (Integer each : list2) { // after adding non-zero elements, to add zeros to the new arrayList
            if (each == 0) {
                result.add(each);
            }
        }
        System.out.println(result);
 */

        System.out.println("------------------------------------------------------");

        String str = "ABCD123#$%@456EFG!&";

        ArrayList<Character> strList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            strList.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(strList); // add all the characters
        letters.removeIf(p -> !Character.isLetter(p)); // removes if the characters are NOT letter
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(strList); // add all the characters
        digits.removeIf(p -> !Character.isDigit(p)); // removes if the characters are NOT digits
        System.out.println("digits = " + digits);

        ArrayList<Character> specialChars = new ArrayList<>(strList); // add all the characters
        specialChars.removeIf(p-> Character.isLetterOrDigit(p)); // removes if the characters are letters or digits
        //  specialChars.removeAll(letters); --> Another approach to remove letters
        //  specialChars.removeAll(digits);  --> Another approach to remove digits
        System.out.println("specialChars = " + specialChars);

//  Another solution with multiBranch If statement -------------------------------------
/*

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            strList.add(element);
            
            if (Character.isLetter(element)) {
                letters.add(element);
            } else if (!Character.isLetterOrDigit(element)) {
                specialChars.add(element);
            } else {
                digits.add(element);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
 */


    }
}
