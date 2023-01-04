package day44_Abstraction.animalTask;

public class Dog extends Animal {

    public Dog(String name, int age, String size, String breed, char gender, String color) {
        super(name, age, size, breed, gender, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }
}
