package day46_Polymorphism;


import day37_Inheritance.animalTask.Animal;
import day37_Inheritance.animalTask.Dog;
import day43_Abstraction.employee.Developer;
import day43_Abstraction.employee.Employee;
import day43_Abstraction.employee.Tester;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Cube;
import day45_Abstraction.Shape.Shape;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        // upcasting
        Shape shape = new Circle(4); // -->  Shape shape = (Shape)new Circle(4);

        System.out.println("----------------------------------------------------------------");

        //downcasting
        Animal animal = new Dog("Max", "Labrador", 'F', 3, "small", "gray");
        Dog dog = (Dog) animal; // downcasting

        ((Dog) animal).bark(); // downcasting
        dog.bark();

        System.out.println(animal.name);
        System.out.println(dog.name);

        System.out.println("----------------------------------------------------------------");

        Employee employee = new Tester("Halid", 33, 'M', 1223, "SDET", 125000);

        ((Tester) employee).bugReport();

        // ((Tester) employee).unitTesting();
        // ((Developer) employee).unitTesting();  ---> ClassCastException - There is no IS A relation between Tester and Developer

        System.out.println("----------------------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        // ((Cube) s1).volume(); ---> ClassCastException - There is no IS A relation between Cube and Circle


    }

}
