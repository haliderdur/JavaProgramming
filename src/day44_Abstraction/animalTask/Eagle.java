package day44_Abstraction.animalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable {

    public Eagle(String name, int age, String size, String breed, char gender, String color) {
        super(name, age, size, breed, gender, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating snake");
    }

    public void hunt() {
        System.out.println(getName() + " is hunting snake");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly");
    }
}
