package day44_Abstraction.animalTask;

/*
Animal Task:
Create an abstract class named Animal:
    Variables: name, breed(final), gender(final), age, size, color(final)
Encapsulate all the fields
Add a constructor that can set all the fields
    Methods:
        eat(); ==> different animals eat different foods
        drink() ==> all the animals drink water
        toString() ==> to display the full info of the animal
Create the following subclasses of Animal:
Dog
    eat(): eats dog food
Cat
    eat(): eats cat food
Tiger
    eat(): eats deer
Parrot
    eat(): eats chocolate
Eagle
    eat(): eats snake
 */
public abstract class Animal {

    private String name;
    private int age;
    private String size;
    private final String breed;
    private final char gender;
    private final String color;

    public Animal(String name, int age, String size, String breed, char gender, String color) {
        setName(name);
        setAge(age);
        setSize(size);
        this.breed = breed;
        if (!(gender == 'M' || gender == 'F')) {
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Invalid name: " + name);
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("Age can not be negative: " + age);
        }
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract void eat();

    public final void drink() {
        System.out.println(name + " is drinking water");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
