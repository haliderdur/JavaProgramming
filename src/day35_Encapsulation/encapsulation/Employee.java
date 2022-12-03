package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            return; // exits the method but does not terminate the program
        }
        this.name = name;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            return; // exits the method but does not terminate the program
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age < 16 || age > 90) {
            return; // exits the method but does not terminate the program
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            return; // exits the method but does not terminate the program
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary= $" + salary +
                '}';
    }
}
