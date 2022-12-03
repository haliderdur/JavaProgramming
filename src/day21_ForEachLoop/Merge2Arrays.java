package day21_ForEachLoop;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {

        String[] group1 = {"Halid", "Messi", "Neymar", "Suarez", "Puyol"};
        String[] group2 = {"Gorkem", "Ronaldo", "Mbappe", "Ramos"};

        String[] players = new String[group1.length + group2.length]; // to have enough capacity in new String Array (merged array)

        int i = 0; // dummy variable to get indexes in Arrays

        for (String each : group1) { // to get group1 elements one by one and assign it to each
            players[i++] = each;
        }
        for (String each : group2) { // to get group2 elements one by one and assign it to each
            players[i++] = each;
        }
        System.out.println(Arrays.toString(players));

        System.out.println("--------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j] = ch;
            j++;
        }
        for (char ch : ch2) {
            chars[j] = ch;
            j++;
        }
        System.out.println(Arrays.toString(chars));


    }
}
