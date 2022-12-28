package day42_Exceptions;

import day31_Constructors.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

        throw new NoSuchElementException("There is no such element as break");

        // throw new InterruptedException();

        // System.out.println("hello world");

        // throw new Rectangle(5, 7);
    }

}
