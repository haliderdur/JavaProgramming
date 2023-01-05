package day44_Abstraction.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", 3, "Medium",
                "Labrador", 'M', "Black");

        Cat cat = new Cat("Lucy", 4, "Small",
                "Siyamese", 'F', "Brown");

        Tiger tiger = new Tiger("SherKahn", 7, "Large",
                "Bengal", 'M', "Orange");

        Parrot parrot = new Parrot("Coco", 5, "Medium",
                "Dominik", 'F', "Green-Red-Yellow");

        Eagle eagle = new Eagle("Elvis", 10, "Large",
                "WhiteHead", 'M', "Black-White");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);
        System.out.println(parrot);
        System.out.println(eagle);

        System.out.println();

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();

        tiger.eat();
        tiger.roar();

        parrot.eat();
        eagle.eat();

        System.out.println();

        dog.drink();
        cat.drink();
        tiger.drink();
        parrot.drink();
        eagle.drink();
    }
}
