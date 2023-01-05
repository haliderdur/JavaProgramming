package day44_Abstraction.animalTask;

public final class Cat extends Animal {

    public Cat(String name, int age, String size, String breed, char gender, String color) {
        super(name, age, size, breed, gender, color);
    }

    public void meow() {
        System.out.println(getName() + " is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food");
    }
}
