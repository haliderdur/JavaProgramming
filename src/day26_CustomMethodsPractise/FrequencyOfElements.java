package day26_CustomMethodsPractise;

/*
1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns
the frequency of the given integer element from the integer array

1.2 Create a method that passes two parameters: a double array and a double element. The method returns the
frequency of the given integer from the array

1.3 Create a method that passes two parameters: a char array and a char element. The method returns the
frequency of the given char element from the char array

1.4 Create a method that passes two parameters: a String array and a String element. The method returns the
frequency of the given String element from the String array
 */
public class FrequencyOfElements {
    public static void main(String[] args) {
        String[] arr = {"Halid", "Salim", "Salim", "Tarik", "Halid", "Salim"};

        frequencyOfElement(arr, "Tarik");
    }

    public static int frequencyOfElement(int[] array, int element) {

        int frequency = 0;

        for (int each : array) {
            if (element == each) {
                frequency++;
            }
        }
        System.out.println(frequency);
        return frequency;
    }

    public static int frequencyOfElement(double[] array, double element) {

        int frequency = 0;

        for (double each : array) {
            if (element == each) {
                frequency++;
            }
        }
        System.out.println(frequency);
        return frequency;
    }

    public static int frequencyOfElement(char[] array, char element) {

        char frequency = 0;

        for (char each : array) {
            if (element == each) {
                frequency++;
            }
        }
        System.out.println(frequency);
        return frequency;
    }

    public static int frequencyOfElement(String[] array, String element) {

        int frequency = 0;

        for (String each : array) {
            if (element.equals(each)) {
                frequency++;
            }
        }
        System.out.println(frequency);
        return frequency;
    }
}
