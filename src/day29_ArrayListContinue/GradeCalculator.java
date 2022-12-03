package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 92, 75, 87, 65, 85, 55, 45, 77, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90~100
        gradeOfA.removeIf(grade -> !(grade >= 90 && grade <= 100));
        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("Total number of A: " + gradeOfA.size());

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80~89
        gradeOfB.removeIf(grade -> !(grade >= 80 && grade <= 89));
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("Total number of B: " + gradeOfB.size());


        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70~79
        gradeOfC.removeIf(grade -> !(grade >= 70 && grade <= 79));
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("Total number of C: " + gradeOfC.size());


        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60~69
        gradeOfD.removeIf(grade -> !(grade >= 60 && grade <= 69));
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("Total number of D: " + gradeOfD.size());


        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0~59
        gradeOfF.removeIf(grade -> !(grade >= 0 && grade <= 59));
        System.out.println("gradeOfF = " + gradeOfF);
/*
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);
 */
        System.out.println("Total number of F: " + gradeOfF.size());


    }


}
