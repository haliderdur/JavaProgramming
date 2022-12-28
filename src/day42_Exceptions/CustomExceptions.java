package day42_Exceptions;

class FadyException extends RuntimeException {

    public FadyException(String message) {
        super(message);
    }

}

public class CustomExceptions {

    public static void main(String[] args) {

        throw new FadyException("It's time for short break");


    }


}
