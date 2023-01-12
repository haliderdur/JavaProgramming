package day46_Polymorphism;

import day37_Inheritance.scrumTask.Employee;
import day38_Inheritance_MethodOverriding.ShapeTask.Circle;
import day38_Inheritance_MethodOverriding.ShapeTask.Rectangle;
import day38_Inheritance_MethodOverriding.ShapeTask.Square;

public class Polymorphism_Intro {

    String str = "Wooden Spoon";
    int n1 = 5;
    double n2 = 2.5;
    boolean r1 = true;

    Object[] array = {str, n1, n2, r1, new Circle(5), new Rectangle(2, 6)};

}
