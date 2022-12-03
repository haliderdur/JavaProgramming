package day16_ForLoopStringPractises;

public class DigitLettersAndSpecialChar {

    public static void main(String[] args) {

        String str = "Cydeo123456School!@#%WoodenSpoon";

        String digits = "";         // 123456
        String letters = "";        // CydeoSchoolWoodenSpoon
        String specialChars = "";   // !@#%

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  //  ch ==> every single characters that we have in String

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                letters += ch;
            } else {
                specialChars += ch;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }

}
