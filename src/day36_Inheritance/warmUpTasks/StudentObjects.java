package day36_Inheritance.warmUpTasks;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Alex", 35, 'M', 'K', "Stanford");
        System.out.println(student1);
        System.out.println("Grade= " + student1.getGrade());

        System.out.println();

        student1.setGrade('B');
        System.out.println("New Grade= " + student1.getGrade());
        System.out.println(student1);
    }
}
