package day13_StringClass;

public class StringMethod {

    public static void main(String[] args) {

        String word = "Cydeo";
        // index:      01234

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

     /*  String index out of range: 9
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
      */

        System.out.println("-------------------------------------");

        String s1 = "Batch 10 is the best batch. Java is the coolest programming language";
        // index:    0123456789................

        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length() - 1);   //  last index number formula
        System.out.println("lastChar = " + lastChar);

        System.out.println("-------------------------------------");

        String str1 = "wooden spoon";
        str1 = str1.toUpperCase();  //  "WOODEN SPOON"

        System.out.println("str1 = " + str1);

        String str2 = "JAVA";
        str2 = str2.toLowerCase();  // "java"

        System.out.println("str2 = " + str2);

        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println("sentence = " + sentence);





    }


}
