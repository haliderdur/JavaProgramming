package day33_Statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Halid");
        Student student2 = new Student("Jack", 'M');
        Student student3 = new Student("Nigara", 2255);
        Student student4 = new Student("Alex", 2255, 'A');
        Student student5 = new Student("Gorkem", 'M', 32);
        Student student6 = new Student("Anna", 'F', 26, 3345);
        Student student7 = new Student("John", 'M', 24, 5578, 'B');


        System.out.println(student1 == student2); // false

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};
        System.out.println(Arrays.toString(students));

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(students));
        System.out.println(studentsList);

    }
}
