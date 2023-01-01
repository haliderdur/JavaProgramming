package day43_Abstraction.employee;

public abstract class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        if (age <= 0) {
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract void sleep();

    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
