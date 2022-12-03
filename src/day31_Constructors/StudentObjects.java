package day31_Constructors;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student("Halid", 33, 2233, 'M', 'C');
        Student student2 = new Student("Lori", 31, 1144, 'F', 'A');
        Student student3 = new Student("Lidia", 30, 1133, 'F', 'B');

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);

        Student[] group = {student1, student2, student3};

        student2.grade = 'B';
        student1.grade = 'A';
        student3.ID = 2255;
        System.out.println("group = " + Arrays.toString(group));

        System.out.println("Student 1 name and grade: " + student1.name + " & " + student1.grade);
        System.out.println("Student 2 name and grade: " + student2.name + " & " + student2.grade);
        System.out.println("Student 3 name and grade: " + student3.name + " & " + student3.grade);


    }
}
