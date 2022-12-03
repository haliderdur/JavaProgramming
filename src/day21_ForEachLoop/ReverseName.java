package day21_ForEachLoop;

public class ReverseName {
    public static void main(String[] args) {

        String[] names = {"Halid Erdur", "Gorkem Agac", "Lionel Messi", "Cristiano Ronaldo",
                "Andreas Iniesta", "Kylian Mbappe", "Mahmut Hoca", "Guduk Necmi", "Tosun Pasa"};

        for (String each : names) { // "Halid Erdur", "Gorkem Agac", "Lionel Messi" ..............
            String reverse = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            System.out.println(reverse);

        }

    }
}
