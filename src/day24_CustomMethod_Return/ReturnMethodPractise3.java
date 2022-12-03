package day24_CustomMethod_Return;

public class ReturnMethodPractise3 {

    public static void main(String[] args) {

        // write a function that can find the unique characters from the String

        String str = "abrwbjswadcmmsmasbdkjas";

        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));

            if (frequency == 1) {
                System.out.println(str.charAt(i));
            }
        }
    }

    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
}
