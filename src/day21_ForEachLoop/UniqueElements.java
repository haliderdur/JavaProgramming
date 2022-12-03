package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Python", "Java", "JavaScript", "HTML", "C#", "HTML", "JavaScript", "C#"};

        for (String each : words) {
            int frequency = 0;
            for (String element : words) {
                if (element.equals(each)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(each);
            }
        }

    }
}
