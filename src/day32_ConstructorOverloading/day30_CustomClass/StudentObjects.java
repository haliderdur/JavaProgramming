package day32_ConstructorOverloading.day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Halid", 'M', 33, 375167, 'A');

        Student student2 = new Student();
        student2.setInfo("Akif", 'M', 32, 123456, 'B');

        Student student3 = new Student();
        student3.setInfo("Sema", 'F', 40, 789456, 'A');

        Student student4 = new Student();
        student4.setInfo("Alex", 'M', 41, 321987, 'D');

        Student student5 = new Student();
        student5.setInfo("Anna", 'F', 36, 456789, 'C');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("-------------------------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade Test
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if (student.grade == 'A') {
                earlyBirds.add(student);
            } else {
                angryBirds.add(student);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("earlyBirds = " + earlyBirds.size());
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("angryBirds = " + angryBirds.size());
    }
}
