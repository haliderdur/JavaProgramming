package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        Given a number (byte) grade level determine and print which school type someone is in
            grade level and types are;
                1-5: Elementary school
                6-8: Middle school
                9-12: High school
                13-16: College
                17-18: Grad school

                For any other grade: Invalid grade level given

            Note:
                solution 1: Use switch statement
                solution 2: Use if & switch both
         */
        byte number = 17;
        String result = null;

        if (number >= 1 && number <= 18) {
            switch (number) {

                case 1: case 2: case 3: case 4: case 5:
                    result = "Elementary school";
                    break;

                case 6: case 7: case 8:
                    result = "Middle school";
                    break;

                case 9: case 10: case 11: case 12:
                    result = "High school";
                    break;

                case 13: case 14: case 15: case 16:
                    result = "College";
                    break;

                default:  //  17-18 for grad school
                    result = "Grad school";
                    break;
            }
        } else {
            result = "Invalid grade level";
        }
        System.out.println(result);
    }
}
