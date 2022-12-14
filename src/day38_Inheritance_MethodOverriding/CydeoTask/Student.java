package day38_Inheritance_MethodOverriding.CydeoTask;

public class Student extends Person {

    private int studentID;
    private String fieldOfStudy;

    public int getStudentID() {
        return studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setStudentID(int studentID) {
        if (studentID <= 0) {
            System.out.println("Invalid student ID: " + studentID);
            System.exit(1);
        }
        this.studentID = studentID;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy.isEmpty() || fieldOfStudy.isBlank()) {
            System.out.println("Field of study can not be empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    public void study() {
        System.out.println(getName() + " is studying");
    }
}
