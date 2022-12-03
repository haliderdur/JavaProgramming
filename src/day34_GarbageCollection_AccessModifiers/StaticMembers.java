package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {   // outer class can not be static

    static class class1 {      // inner class can be static

        static class class2 {  // inner class can be static

        }
    }

    public static int num = 100;   // static variable

    public static void method() {  // static method

    }

    static {                       // static block

    }
}

class A { // outer class
    static class B { // inner static class
        public static void method1() { // inner class method
        }
    }
}

class C {
    public static void main(String[] args) {
        A.B.method1(); // to call inner class method --> outerClassName.innerClassName.methodName();
    }
}


