package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        // find the max number between 100 & 200
        int result = maxNumber(100, 200);
        System.out.println(result);

        // multiply the max number by 2
        int multiplication = result * 2;
        System.out.println(multiplication);

    }

    public static int maxNumber(int num1, int num2) {
        int max = 0;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        return max;
    }


}
