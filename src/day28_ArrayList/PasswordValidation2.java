package day28_ArrayList;

public class PasswordValidation2 {
    public static void main(String[] args) {

        String password = "cyDeo1990@";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigit = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigit++;
            } else {
                countSpecialChar++;
            }
        }

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigit = countDigit > 0;
        boolean hasSpecialChar = countSpecialChar > 0;


        // boolean StrongPassword = password.length() >= 8 && !password.contains(" ") && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        boolean StrongPassword = false;
        if (password.length() >= 8) {
            if (!password.contains(" ")) {
                if (hasUpperCase) {
                    if (hasLowerCase) {
                        if (hasDigit) {
                            if (hasSpecialChar) {
                                StrongPassword = true;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Strong Password: " + StrongPassword);


    }
}
