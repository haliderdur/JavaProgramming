package day44_Abstraction.animalTask;

public final class Dog extends Animal {

    public Dog(String name, int age, String size, String breed, char gender, String color) {
        super(name, age, size, breed, gender, color);
    }

    public void bark() {
        System.out.println(getName() + " is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }
}
