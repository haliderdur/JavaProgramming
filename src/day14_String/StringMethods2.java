package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");   // Python is fun, I love learning Python

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "johnsmith@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);  // gmail

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        sentence = sentence.replace("Python", "");  // to remove Python from the sentence, we can replace Python with empty string

        System.out.println("sentence = " + sentence);  // sentence = Java Java   C# C# C++ C++

        sentence = sentence.replace("  ", "");
        System.out.println("sentence = " + sentence);  // sentence = Java Java C# C# C++ C++
        
        String s = "Dog Dog Dog Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog","Cat");

        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java");  //  or s2 = s2.replace("C# is c", "Java is c");

        System.out.println("s2 = " + s2);

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");

        System.out.println("result = " + result);
        
        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");

        System.out.println("result2 = " + result2);


    }


}
