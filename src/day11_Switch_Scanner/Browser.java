package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName = "edge";

        String result = null;

        boolean validBrowser = browserName == "chrome" || browserName == "firefox"
                || browserName == "safari" || browserName == "opera" || browserName == "edge";

        if (validBrowser) {
            if (browserName == "chrome") {
                result = "Chrome browser is selected";
            } else if (browserName == "firefox") {
                result = "Firefox browser is selected";
            } else if (browserName == "safari") {
                result = "Safari browser is selected";
            } else if (browserName == "opera") {
                result = "Opera browser is selected";
            } else {
                result = "Edge browser is selected";
            }
        } else {
            result = "Invalid browser";
        }
        System.out.println(result);
    }
}