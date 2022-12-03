package day31_Constructors;

public class Student {

    public String name;
    public int age, ID;
    public char gender, grade;

    public Student(String name, int age, int ID, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
