package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiersTEST2 {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);

        // System.out.println(AccessModifiers.privateData);
        // private access modifier is not reachable outside of class

        // System.out.println(AccessModifiers.defaultData);
        // default access modifier is not reachable outside of package

        AccessModifiers.method1();

        //  AccessModifiers.method2();
        // default access modifier is not reachable outside of package

        //   AccessModifiers.method3();
        // private access modifier is not reachable outside of class

    }
}
