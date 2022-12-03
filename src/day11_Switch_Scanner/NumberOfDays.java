package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int year = 2022;
        int numberOfMonth = 2;
        String result = null;

        if (numberOfMonth >= 1 && numberOfMonth <= 12) {  // n 1 ~ 12

            switch (numberOfMonth) {

                case 2:
                    if (year % 4 == 0) {
                        result = "29 days";
                    } else {
                        result = "28 days";
                    }
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 days";
                    break;

                default: // 1, 3, 5, 7, 8, 10, 12
                    result = "31 days";
            }
        } else {
            result = "Invalid";
        }
        System.out.println(result);
    }
}
