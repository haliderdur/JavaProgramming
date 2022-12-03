package day13_StringClass;

import java.lang.String;
// Any class in "java.lang" is being imported implicitly by compiler automatically
// We don't have to write import statement for String

public class StringIntro {
    public static void main(String[] args) {

        String name1 = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name1 == name2); // true
        System.out.println(name2 == name3); // true
        System.out.println(name3 == name4); // true

        System.out.println("---------------------------------------");

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");

        System.out.println(str1 == str2);   // false
        System.out.println(str2 == str3);   // false
        System.out.println(str3 == str4);   // false

        System.out.println("---------------------------------------");

        String s1 = "java";
        String s2 = new String("java");
        System.out.println(s1.equals(s2));  // true

        String s3 = "JAVA";
        String s4 = new String("java");
        System.out.println(s3.equals(s4));  // false  -  Java is a case sensitive language



    }
}
