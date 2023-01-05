package day44_Abstraction.animalTask;

public final class Parrot extends Animal implements Playable, Flyable {

    public Parrot(String name, int age, String size, String breed, char gender, String color) {
        super(name, age, size, breed, gender, color);
    }

    public void repeat() {
        System.out.println(getName() + " is repeating what people say");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating chocolate");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with bird toy");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly");
    }
}
