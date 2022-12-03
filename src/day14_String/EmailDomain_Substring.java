package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {

        String email = "haliderdur@gmail.com";

        // String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println("domain = " + domain);

    }
}
