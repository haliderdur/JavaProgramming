package day21_ForEachLoop;

/*
print the first and last character of each element from the array
 */
public class ForEachLoopPractise {
    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Angry Birds"};

        for (String each : words) {
            System.out.println(each.charAt(0) + "" + each.charAt(each.length() - 1));
        }

    }
}
