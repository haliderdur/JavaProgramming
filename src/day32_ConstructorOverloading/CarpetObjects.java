package day32_ConstructorOverloading;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(10.5, 7.5, 10.99, true);
        System.out.println(carpet1);

        Carpet carpet2 = new Carpet(10.5, 7.5, 10.99, false);
        System.out.println(carpet2);
    }
}
