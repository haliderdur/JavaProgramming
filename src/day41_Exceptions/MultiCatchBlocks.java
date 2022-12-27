package day41_Exceptions;

import day38_Inheritance_MethodOverriding.CydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

        try {
            System.out.println(employee.getSalary()); // NullPointer Exception

        } catch (IndexOutOfBoundsException e) {
            System.out.println("First catch block");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Second catch block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Third catch block");
            e.printStackTrace();
        } catch (RuntimeException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }

        System.out.println("Test completed");
    }
}
