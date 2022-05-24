package Lesson_5_double;
//Write a program to calculate the square of a circle.

public class Homework1 {
    public static void main(String[] args) {
        double radius = 10.4;
        System.out.println("Square of Circle = " + findSquareOfCircle(radius));
    }

    public static double findSquareOfCircle(double radius) {
        final double PI = Math.PI;
        return PI * radius * radius;
    }
}
