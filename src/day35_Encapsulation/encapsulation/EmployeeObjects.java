package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Daniel", 'M', 35, 120_000);
        System.out.println(emp1);

        Employee emp2 = new Employee("Jackie", 'F', -30, 100_000);
        System.out.println(emp2);

        emp2.setSalary(95000);
        System.out.println("employee2 salary: $" + emp2.getSalary());

        emp1.setAge(45);
        System.out.println(emp1);

        System.out.println("employee2 age: " + emp2.getAge());
        emp2.setAge(36);
        System.out.println("employee2 age: " + emp2.getAge());

        System.out.println("employee2 name: " + emp2.getName());
        emp2.setName("Alexa");
        System.out.println("employee2 name: " + emp2.getName());


    }
}
