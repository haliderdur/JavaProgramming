package day40_FinalKeyword;

public class Animal {

    private String name;
    private int age;
    private String size;
    private final String breed;
    private final char gender;
    private final String color;

    public Animal(String name, int age, String size, String breed, char gender, String color) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.breed = breed;
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
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public final void drink() {
        System.out.println(name + " is drinking water");
    }
}
