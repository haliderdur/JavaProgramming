package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiersTEST4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //  System.out.println(AccessModifiersTEST4.name1);
        // default is not visible outside of the package

        System.out.println(AccessModifiersTEST4.name2);
        // protected is visible outside of the package in subclass only

        // AccessModifiersTEST4.method1();
        // default is not visible outside of the package

        AccessModifiersTEST4.method2();
        // protected is visible outside of the package in subclass only

    }
}
