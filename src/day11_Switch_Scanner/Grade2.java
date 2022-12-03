package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch = 'C';
        String result = null;

        // this is the only way that we can use OR logic with switch

        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";
                break;
        }
        System.out.println(result);
    }
}
