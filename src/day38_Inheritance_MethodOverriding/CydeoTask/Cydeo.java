package day38_Inheritance_MethodOverriding.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Tester tester = new Tester("Halid", 33, 'M', 2255, "SDET", 110000);
        Developer developer = new Developer("Lily", 30, 'F', 3344, "Java Developer", 120000);
        Teacher teacher = new Teacher("Alex", 38, 'M', 1122, "Math Teacher", 100000);
        Student student = new Student("Daniel", 25, 'M', 7711, "QA");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);

        developer.setAge(29);
        System.out.println(developer.getAge());

        developer.work();
        tester.work();
        teacher.work();
        student.study();

        developer.fixingBugs();
        tester.createTicket();
        teacher.eat();
        student.drink();
        tester.eat();
        developer.sleep();

    }
}
