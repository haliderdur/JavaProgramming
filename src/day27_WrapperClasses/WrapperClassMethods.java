package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123"; // String

        int num = Integer.parseInt(str); // int

        System.out.println(num + 1); // 123 + 1 == 124  --> adding
        System.out.println(str + 1); // 123 + 1 == 1231 --> concatenating

        String str2 = "10.5"; // String

        double num2 = Double.parseDouble(str2); // double

        System.out.println(num2 + 1.2); // 10.5 + 1.2 == 11.7    --> adding
        System.out.println(str2 + 1.2); // 10.5 + 1.2 == 10.51.2 --> concatenating

        int maxI = Integer.MAX_VALUE;
        int minI = Integer.MIN_VALUE;
        System.out.println("max = " + maxI);
        System.out.println("min = " + minI);

        double maxD = Double.MAX_VALUE;
        double minD = Double.MIN_VALUE;
        System.out.println("maxD = " + maxD);
        System.out.println("minD = " + minD);

        long maxL = Long.MAX_VALUE;
        long minL = Long.MIN_VALUE;
        System.out.println("maxL = " + maxL);
        System.out.println("minL = " + minL);

        System.out.println("------------------------------------");

        String s1 = "123";
        Integer n1 = Integer.valueOf(s1); // integer
        int n2 = Integer.valueOf(s1); // int

        System.out.println(n1);
        System.out.println(n2);


        String s2 = "1.5";
        Double d1 = Double.valueOf(s2); // double

        System.out.println(s2);


        System.out.println("------------------------------------");

        char ch1 = '?';

        // isDigit()
        boolean r2 = Character.isDigit(ch1); // 5 is digit, so true
        System.out.println(r2);

        // isLetter()
        boolean r3 = Character.isLetter(ch1); // 5 is not letter, so false
        System.out.println(r3);

        // for special characters, there is no method but we can convert isDigit and isLetter - isLetterOrDigit()
        boolean r4 = !Character.isLetterOrDigit(ch1); // !  if character is not letter nor digit, the its special character
        System.out.println(r4);

        // isUpperCase()
        boolean r5 = Character.isUpperCase(ch1);
        System.out.println(r5);

        // isLowerCase()
        boolean r6 = Character.isLowerCase(ch1);
        System.out.println(r6);

        System.out.println("------------------------------------");

        String s = "ab1cde2adfr3safa4sadsaf";
        int sum = 0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println("sum = " + sum);

    }
}
