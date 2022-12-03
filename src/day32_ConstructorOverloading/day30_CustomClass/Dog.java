package day32_ConstructorOverloading.day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, String dogSize, String dogColor, int dogAge, char dogGender) {
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Attributes[Fields]:
        name, age, gender, breed, size, color ...

Actions[Methods]:
        eat(), play(), bark() ...

 */