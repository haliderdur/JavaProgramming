package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Labrador", 'F', 3, "small", "gray");
        System.out.println(dog);

        Cat cat = new Cat("Tobias", "Siamese", 'M', 4, "medium", "brown");
        System.out.println(cat);

        Bird bird = new Bird("King", "Macaw", 'M', 2, "small", "Blue", "Red");
        System.out.println(bird);
    }
}
