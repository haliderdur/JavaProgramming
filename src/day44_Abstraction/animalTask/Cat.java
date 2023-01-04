package day44_Abstraction.animalTask;

public class Cat extends Animal {

    public Cat(String name, int age, String size, String breed, char gender, String color) {
        super(name, age, size, breed, gender, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food");
    }
}
