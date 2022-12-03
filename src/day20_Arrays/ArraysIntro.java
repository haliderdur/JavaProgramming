package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // create a variable that is capable enough to contain 5 names

        String[] myGroup = new String[5]; // 5 is the length of Array. index 0 until index 4
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
        // myGroup[5] = "Halid";

        // System.out.println(myGroup); // hashcode - do not print directly arrays
        System.out.println(Arrays.toString(myGroup)); // ["Gunay", "Neira", "Suat", "Hulya", "Mikael"]

        System.out.println("-------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index            0           1           2           3           4         5         6
        System.out.println(Arrays.toString(days));

        int number = 5; // 5th day of week is Friday

        if (number < 1 || number > 7) {
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number - 1]); // to get Friday, subtract 1 from int value. Cuz index starts with 0


    }
}
