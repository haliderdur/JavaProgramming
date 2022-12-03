package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {  // i: 0, 1, 2  --> 3 times
            System.out.println("WOODEN SPOON");
            for (int j = 0; j < 5; j++) { // j: 0, 1, 2, 3, 4 --> 5 times
                System.out.println("wooden spoon");
                for (int k = 0; k < 3; k++) {  // k: 0, 1  --> 2 times
                    System.out.println("WS");
                } // total 30 times
            }
        }





    }

}
