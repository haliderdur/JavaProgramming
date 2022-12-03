import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}

class StudentObjects {
    public static void main(String[] args) {
        day33_Statics.Student student1 = new day33_Statics.Student("Halid");
        day33_Statics.Student student2 = new day33_Statics.Student("Jack", 'M');
        day33_Statics.Student student3 = new day33_Statics.Student("Nigara", 2255);
        day33_Statics.Student student4 = new day33_Statics.Student("Alex", 2255, 'A');
        day33_Statics.Student student5 = new day33_Statics.Student("Gorkem", 'M', 32);
        day33_Statics.Student student6 = new day33_Statics.Student("Anna", 'F', 26, 3345);
        day33_Statics.Student student7 = new day33_Statics.Student("John", 'M', 24, 5578, 'B');


        System.out.println(student1 == student2); // false

        day33_Statics.Student[] students = {student1, student2, student3, student4, student5, student6, student7};
        System.out.println(Arrays.toString(students));

        ArrayList<day33_Statics.Student> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(students));
        System.out.println(studentsList);

    }
}
