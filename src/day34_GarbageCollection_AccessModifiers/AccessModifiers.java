package day34_GarbageCollection_AccessModifiers;

/*
public    --> Always reachable
private   --> Only reachable within same class
default   --> Only reachable within same package
protected
 */
public class AccessModifiers {

    public static int publicData = 100;   // public modifier
    private static int privateData = 300; // private modifier
    static int defaultData = 200;         // default modifier

    public static void method1() {
        System.out.println("public");
    }

    static void method2() {
        System.out.println("default");
    }

    private static void method3() {
        System.out.println("Private");
    }


    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(privateData);
        System.out.println(defaultData);
    }

}
