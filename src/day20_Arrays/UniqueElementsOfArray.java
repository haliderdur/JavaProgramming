package day20_Arrays;

public class UniqueElementsOfArray {
    public static void main(String[] args) {

        String[] words = {"HTML", "Python", "JavaScript", "Python", "Java", "C#", "Python", "JavaScript"};

        for (int j = 0; j < words.length; j++) {
            String element = words[j]; // "Java"
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);
            }
        }

    }
}
