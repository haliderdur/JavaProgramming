package day16_ForLoopStringPractises;

public class FindUnique {
    public static void main(String[] args) {

        String str = "acabaccac";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // char ==> each characters of str
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {//if the first and last index numbers of characters are same, this means that character is unique
                result += ch;
            }
        }
        System.out.println(result);
    }
}
