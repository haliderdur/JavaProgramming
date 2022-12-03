package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        // {6,5,4,3,2,1}

        int[] revArray = new int[array.length];
        int index = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            revArray[index++] = array[i];
        }
        System.out.println(Arrays.toString(revArray));

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            reversedList.add(each);
        }
        System.out.println(reversedList);


    }


}
