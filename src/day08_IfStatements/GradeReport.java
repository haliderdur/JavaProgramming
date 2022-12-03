package day08_IfStatements;

/*
score:
    90 ~ 100 = excellent
    80 ~ 89 = Great
    70 ~ 79 = Good
    60 ~ 69 = Passed
    0 ~ 59 = Failed
 */

public class GradeReport {
    public static void main(String[] args) {

        int score = 85;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;  // boolean b = score >= 80 && !a ;
        boolean c = score >= 70 && score <= 79;  // boolean c = score >= 70 && !a && !b ;
        boolean d = score >= 60 && !a && !b && !c;
        boolean f = !a && !b && !c && !d;

        if (a) {  // if student got a score
            System.out.println("Excellent");
        }

        if (b) { // if student got b score
            System.out.println("Great");
        }

        if (c) {
            System.out.println("Good");
        }

        if (d) {
            System.out.println("Passed");
        }

        if (f) {
            System.out.println("Failed");
        }
    }
}
