package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {

/*
Primitives;
double > float > long > int > short > byte
 - smaller primitives can be assigned to larger primitive types
 - larger primitives CAN NOT be assigned to smaller primitive types (needs to be casted manually)
*/

//implicit castings are applied automatically by compiler. no need to add ()
        byte a = 100;
        short b = a;   // short b = (short)a
        System.out.println(a + " : " + b);

        short c = 250;
        int d = (int) c;
        System.out.println(c + " : " + d);

        float e = 5.9f;
        double g = e;
        System.out.println(e + " : " + g);

        long w = 25087;
        double p = w;
        System.out.println(w + " : " + p);

        System.out.println("---------------------");

//explicit castings needs to be done manually
        int a1 = 50;
        short b1 = (short) a1;
        System.out.println(a1 + " : " + b1);

        long c1 = 200000;
        short d1 = (short) c1;
        System.out.println(c1 + " : " + d1);

        double e1 = 2.5;
        float f1 = (float) e1;
        System.out.println(e1 + " : " + f1);

    }
}
