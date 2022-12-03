package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iPhone1 = new Iphone("iphone 14 pro", "6.7 inches", 1200, "white");
        System.out.println(iPhone1);

        iPhone1.call(965359512);
        iPhone1.text(256456123);
        iPhone1.faceTime("haliderdur@gmail.com");
        iPhone1.faceTime(856445556);

        System.out.println();

        Samsung samsung1 = new Samsung("Galaxy S19", "8 inches", 800, "black");
        System.out.println(samsung1);

        samsung1.call(456456123);
        samsung1.text(123456789);
        samsung1.freeze();

        System.out.println();

        Nokia nokia1 = new Nokia("6630", "5 inches", 50, "Red");
        System.out.println(nokia1);

        nokia1.call(911);
        nokia1.text(789456369);
        nokia1.selfDefense();

    }
}
