package Chap8;

import java.util.Scanner;

public class MathIsFun {
    public static final double PI_APPROX = 3.14159;

    public static int mathCounter = 0;

    public static double calculateCircumference(double radius) {
        mathCounter++;
        return PI_APPROX * radius *2;
    }

}
