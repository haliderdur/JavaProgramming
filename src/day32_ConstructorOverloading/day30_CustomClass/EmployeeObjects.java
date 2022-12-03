package day32_ConstructorOverloading.day30_CustomClass;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("John", "SDET", 1122, 'M', 110000, true);

        Employee employee2 = new Employee();
        employee2.setInfo("Anna", "BA", 2222, 'F', 50000, false);

        Employee employee3 = new Employee();
        employee3.setInfo("Veronica", "Developer", 3322, 'F', 65000, false);

        Employee employee4 = new Employee();
        employee4.setInfo("Alan", "Scrum Master", 4422, 'M', 95000, true);

        Employee employee5 = new Employee();
        employee5.setInfo("Cris", "Developer", 5522, 'M', 130000, true);

        Employee[] allEmployees = {employee1, employee2, employee3, employee4, employee5};

/*
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5));

        ArrayList<Employee> fullTimeEmp = new ArrayList<>();
        ArrayList<Employee> partTimeEmp = new ArrayList<>();

        for (Employee employee : allEmployees) {
            if (employee.isFullTime) {
                fullTimeEmp.add(employee);
            } else {
                partTimeEmp.add(employee);
            }
        }
        System.out.println("Full Time: " + fullTimeEmp.size());
        System.out.println("Part Time: " + partTimeEmp.size());
 */
        int countFullTime = 0;
        int countPartTime = 0;
        double max = allEmployees[0].salary;
        double min = allEmployees[0].salary;

        for (Employee employee : allEmployees) {
            if (employee.isFullTime) {
                countFullTime++;
            } else {
                countPartTime++;
            }
            if (employee.salary > max) {
                max = employee.salary;
            }
            if (employee.salary < min) {
                min = employee.salary;
            }
        }
        System.out.println("Full Time: " + countFullTime);
        System.out.println("Part Time: " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
