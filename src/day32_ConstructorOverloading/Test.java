package day32_ConstructorOverloading;

public class Test {

    public Test() { // Test
        System.out.println("Test");
    }

    public Test(int a) { // Test  B
        this();
        System.out.println("B");
    }

    public Test(double a) { // Test  B  C
        this(10);
        System.out.println("C");
    }

    public Test(String str) { // Test B C D
        this(2.5);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test("Java");
    }
}
