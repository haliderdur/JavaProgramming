package day36_Inheritance.animalTask;

public class Animals {

    public String name;
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }


}
