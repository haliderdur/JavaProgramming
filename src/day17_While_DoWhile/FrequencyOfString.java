package day17_While_DoWhile;

/*
Write a program that can return the frequency of the word from the sentence
    Ex:
        sentence = "Java Java"
    Output:
        2
 */
public class FrequencyOfString {
    public static void main(String[] args) {

        String str = "Java Python JavaJava JavaPyTHon PYthOn Java JAvAjaVAJAVA";
        int frequency = 0;

        for (int i = 0; i <= str.length() - 4; i++) {
        /*   str.substring(0,4);   Java
             str.substring(1,5);   avaJ
             str.substring(2,6);   vaJa
             str.substring(3,7);   aJav   */
            String eachSub = str.substring(i, i + 4);
            if (eachSub.equalsIgnoreCase("Java")) {
                frequency++;
            }
        }
        System.out.println(frequency);

    }
}
