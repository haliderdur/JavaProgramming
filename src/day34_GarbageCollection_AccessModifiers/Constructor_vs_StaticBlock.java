package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static { // will be executed first
        System.out.println("Static BLock");
    }

    public Constructor_vs_StaticBlock() { // will be executed if we create an object - constructor execution depends on object
        System.out.println("Constructor");
    }

    public static void main(String[] args) { // will be executed after static blocks
        new Constructor_vs_StaticBlock(); // object
        new Constructor_vs_StaticBlock(); // object
        new Constructor_vs_StaticBlock(); // object

        System.out.println("Main Method");

        new Constructor_vs_StaticBlock(); // object

    }
}
