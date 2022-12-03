package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // > , >= , < , <=

        boolean result1 = 20 > 40;
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150;
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 400;
        System.out.println("result4 = " + result4);

        // credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;  // if the credit score is 720 or greater, then its eligible for the loan
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5 = 100 < 200;  // true
        System.out.println("result5 = " + result5);
        boolean result6 = 200 < 180;  // false
        System.out.println("result6 = " + result6);

        int passMark = 60;
        int score = 50;
        boolean hasFailed = score <= passMark;
        System.out.println("hasFailed = " + hasFailed);

        System.out.println("------------------------------------");
        // equal: ==

        int x = 100;
        int y = 200;

        boolean isEqual = x == y;
        System.out.println("isEqual = " + isEqual);

        boolean result8 = "Halid" == "Bad Guy";  // false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a';  // false  -  Java is case sensitive
        System.out.println("result9 = " + result9);

        boolean result10 = "Lisbon" == "Lisbon";  // true  -  exactly same string of text
        System.out.println("result10 = " + result10);

        boolean result11 = "Java  " == "Java";  // false  -  blanks are also counted as character
        System.out.println("result11 = " + result11);

        System.out.println("------------------------------------");
        // not equal: !=

        boolean result12 = 100 != 200;  // true
        System.out.println("result12 = " + result12);

        boolean result13 = "Java" != "Break";  // true
        System.out.println("result13 = " + result13);

        boolean result14 = 300 != 300;  // false
        System.out.println("result14 = " + result14);

    }
}
