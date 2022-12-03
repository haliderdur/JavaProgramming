package day19_LoopPractises;

/*
Write a program that find the unique chars from the string without using indexOf() and lastIndexOf() methods
        Ex;
            str = "aabccdeef";
        Output:
            bdf
 */
public class UniqueChars {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";

        for (int j = 0; j < str.length(); j++) { // aabccdeef
            char ch = str.charAt(j);
            int count = 0;  // represents the frequency of char

            for (int i = 0; i < str.length(); i++) {  // compares the character that outer loop picked, with each character of String
                char each = str.charAt(i);  // each character of str
                if (ch == each) {  // whenever the character matches (outer&inner loop characters), increases the count +1
                    count++;
                }
            }
         /*
          if (count == 1) {  //  if the frequency of character is equal to 1 --> means those characters are unique
                result += ch;
          */
            if (count != 1) {  // if the frequency of char is not equal to 1, then skip
                continue;
            }
            result += ch;
        }
        System.out.println(result);

    }
}
