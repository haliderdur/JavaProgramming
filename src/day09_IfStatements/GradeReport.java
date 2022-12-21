package day09_IfStatements;

public class GradeReport {
    /*
    Grade Report ==> Test, B, C, D, F
     */
    public static void main(String[] args) {
        int n = 75;
        String score = null;
        boolean a = n >= 90 && n <= 100,
                b = n >= 80 && n < 90,
                c = n >= 70 && n < 80,
                d = n >= 60 && n < 70,
                f = n < 60;
        if (a) {
            score = "Test";
        } else if (b) {
            score = "B";
        } else if (c) {
            score = "C";
        } else if (d) {
            score = "D";
        } else {
            score = "F";
        }
        System.out.println(score);
    }
}
