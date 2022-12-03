package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaaaabcczxxccdeyyjeeekkf";

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println("List1 = " + list1);

        System.out.println("-------------------------------OR-----------------------------------------------");

        String[] arr = str.split("");
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println("List2 = " + list2);

        System.out.println("---------------------------find unique------------------------------------------");

        String unique = "";

        for (String each : list2) {
            int frequency = Collections.frequency(list2, each);
            if (frequency == 1) {
                unique += each;
            }
        }
        System.out.println("unique = " + unique);


    }


}
