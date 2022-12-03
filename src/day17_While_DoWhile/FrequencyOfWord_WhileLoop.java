package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "C#JaVa C# Java JAVA pyhton PytHON JAva jAVApythON";
        str = str.toLowerCase();
        int frequency = 0;

        while (str.contains("java")) {
            str = str.replaceFirst("java", "");
            frequency++;
        }
        System.out.println("Frequency = " + frequency);

        System.out.println("-----------------------------");

        String sentence = "cat CATDOG dogCaT dogCAT dogdogDOG";
        sentence = sentence.toLowerCase();

        int countCat = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println("Cat = " + countCat);

        System.out.println("------------------------------");

        String s = "python PYthON JAvaPythON java JAVA pythonPythoN";
        s = s.toLowerCase();

        int countJava = 0;
        int countPython = 0;

        while (s.contains("java") || s.contains("python")) {
            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                countJava++;
            }
            if (s.contains("python")) {
                s = s.replaceFirst("python", "");
                countPython++;
            }
        }
        System.out.println("Java = " + countJava);
        System.out.println("Python = " + countPython);

    }
}
