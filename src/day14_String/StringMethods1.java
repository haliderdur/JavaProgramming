package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "    batch 10   ";

        str1 = str1.trim();   // "batch 10"

        System.out.println(str1);

        System.out.println("----------------------");

        String str2 = "Cydeo School";
        // index:  0123456789..
        int n1 = str2.indexOf("h");

        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("d");
        System.out.println("n2 = " + n2);

        int n3 = str2.indexOf("Sch");
        System.out.println("n3 = " + n3);

        String str3 = "Java Programming Language";
        int n4 = str3.indexOf("amm");

        System.out.println("n4 = " + n4);

        int n5 = str3.indexOf("ge");
        System.out.println("n5 = " + n5);

        int n6 = str3.lastIndexOf("g");
        System.out.println("n6 = " + n6);

        System.out.println("----------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        int fourthA = s.indexOf("ava W");
        int fourthA1 = s.lastIndexOf("av");  // alternative for fourth a
        int fourthA2 = s.indexOf("Ca") + 1;  // alternative for fourth a
        int fifthA = s.indexOf("a W");
        int fifthA1 = s.lastIndexOf("va") + 1;  // alternative for fifth a

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fourthA1 = " + fourthA1);
        System.out.println("fourthA2 = " + fourthA2);
        System.out.println("fifthA = " + fifthA);
        System.out.println("fifthA1 = " + fifthA1);


    }


}
