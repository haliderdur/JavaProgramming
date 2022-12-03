package day14_String;

public class StringMethods4 {
    public static void main(String[] args) {

        String str = "Cydeo";
        str = str.repeat(4);

        System.out.println(str);

        System.out.println("----------------------------------------------------------");

        String str2 = "Wooden Spoon ";
        str2 = str2.repeat(100);

        System.out.println(str2);

        System.out.println("----------------------------------------------------------");

        System.out.println("Hello World\n".repeat(10));

        System.out.println("----------------------------------------------------------");

        String name = "Java";

        System.out.println((name + " ").repeat(5));


    }


}
