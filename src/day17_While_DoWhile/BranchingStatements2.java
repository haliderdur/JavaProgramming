package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------");

        // print all even numbers 1~10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // to catch even numbers, we need to skip numbers if their remainder is not 0, then continue to loop --> If (true) => then skip
                continue;  // skip
            }
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("----------------");
        // print all odd numbers 1~10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // to catch odd numbers, we need to skip numbers if their remainder is 0, then continue to loop --> If (true) => then skip
                continue; // skip
            }
            System.out.print(i + " ");
        }


    }
}
