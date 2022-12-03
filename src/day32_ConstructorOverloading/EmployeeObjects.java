package day32_ConstructorOverloading;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        Employee employee2 = new Employee("Alex", 'M');
        Employee employee3 = new Employee("Olga", 'F', "SDET");
        Employee employee4 = new Employee("John", 'M', "Developer", 150000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
    }
}
