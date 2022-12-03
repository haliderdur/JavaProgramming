package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class SalimEtut {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int element = 5;

        int[] newArr = addElement(arr1,element);
        System.out.println(Arrays.toString(newArr));

    }
    //                                {1,2,3}     4
    public static int[] addElement(int[] array, int element){
        int length = array.length+1;
        int[] result = new int[length]; // 0,1,2
        int index = 0;

        for (int each : array) {
            result[index] = each;
            index++;
        }
        result[index] = element;
        return result;
    }

}
