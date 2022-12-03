package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Max", "Husky", 'M', 2, "Small", "White");

        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.bark();
        // dog1.hunt();
        dog1.move();
        // dog1.scratch();

        System.out.println(dog1);


        Cat cat1 = new Cat();
        cat1.setInfo("Pipa", "British Short Hair", 'F', 3, "Small", "Grey");

        cat1.eat();
        cat1.drink();
        cat1.sleep();
        // cat1.bark();
        // cat1.hunt();
        cat1.scratch();

        System.out.println(cat1);


        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();
        // tiger1.bark();
        tiger1.hunt();
        tiger1.roar();
        // tiger1.scratch();

        System.out.println(tiger1);


    }
}
