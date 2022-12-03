package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"Halid Erdur", "Gorkem Agac", "Lionel Messi", "Cristiano Ronaldo",
                "Andreas Iniesta", "Kylian Mbappe", "Mahmut Hoca", "Guduk Necmi", "Tosun Pasa"};

        for (String each : names) {
            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1);
            System.out.println(initial);
        }


    }
}
