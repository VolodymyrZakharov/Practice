package Lesson_5_double;
// find circumference

public class Homework2 {
    public static void main(String[] args) {
        double radius = 10.5;
        System.out.println("Circumference = " + findCircumference(radius));
    }

    public static double findCircumference(double radius) {
        final double PI = Math.PI;
        return 2 * PI * radius;
    }
}
