package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        //age:32 years old
        byte age = 32;

        //weight:160 pounds
        //byte weight = 160;   => 160 is out of byte range. byte range is -128 to 127
        short weight = 160;    //160 is within the range of short

        //salary: 100000
        //short salary = 100000  // 100000 is out of short range. short range is -32,768 to 32,767
        int salary = 100_000;

        //asset: 3_333_333_333
        //int asset = 3_333_333_333  // 3_333_333_333 is out of int range. int range is -2,147,483,648 to 2,147,483,648
        long asset = 3_333_333_333L;
        //to make compiler to recognize LONG, we need to add "l" or "L" (lower or upper case L) after the number. Otherwise, compiler will try to take LONG as INT and will give error
        //compiler is not giving error for byte and short cuz their ranges are already within int range


        //tax: 0.26
        float tax = 0.26F;
        //to make compiler to recognize FLOAT, we need to add "f" or "F" (lower or upper case F) after the number. Otherwise, compiler will try to take FLOAT as DOUBLE and will give error

        double PI = 3.14;

//--------------------------------------
        //char = We use when we have only one character
        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 28700;
        System.out.println("ch3 = " + ch3);

        char gender = 'M';
        System.out.println("gender = " + gender);

        char licenseType = 'B';
        System.out.println("license Type = " + licenseType);

        char YesNo = 'Y';
        System.out.println("Yes/No = " + YesNo);

        boolean isEmployed = true;
        boolean isMarried = false;
        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);

        boolean result = 100 > 300;
        System.out.println("result = " + result);

//-------------------------------------------------
        //String = We use when we have sequence of characters (more than a character)
        String name = "Wooden Spoon";
        String city = "Lisbon";
        String Country = "Portugal";




    }


}
