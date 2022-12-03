package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str = "     ";

        boolean r = str.isEmpty();
        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1);

        System.out.println("----------------");

        String str2 = "Cydeo   ";

        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());

        System.out.println("----------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));  // false
        System.out.println(s1.equalsIgnoreCase(s2));  // true

        //  yes, Yes, YEs, YES, yeS.....

        System.out.println("yEs".equals("Yes")); // false
        System.out.println("yEs".equalsIgnoreCase("YES")); // true

        System.out.println("----------------");

        String sentence = "My favorite programming language is Java";

        boolean hasPython = sentence.contains("Python"); // false
        boolean hasJava = sentence.contains("Java");  // true
        boolean hasJava2 = sentence.contains("JAVA"); // false
        boolean hasJava3 = sentence.toLowerCase().contains("java");   // to avoid case sensitivity when using ".contains" method
        boolean hasJava4 = sentence.toUpperCase().contains("JAVA");

        System.out.println(hasPython);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(hasJava4);

        System.out.println("----------------");

        String input1 = "I love JaVa";
        String input2 = "Java";

        System.out.println(input1.equals(input2));  // false
        System.out.println(input1.equalsIgnoreCase(input2));  // false

        System.out.println(input1.contains("Java")); // false

        System.out.println(input1.toLowerCase().contains("java"));  // true
        System.out.println(input1.toUpperCase().contains("JAVA"));  // true

        System.out.println("----------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("oon");
        boolean z = a.toLowerCase().startsWith("wo");
        // in order to ignore case sensitivity, we create the lower case of upper case version of string and then compare it with lower/upper case

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
