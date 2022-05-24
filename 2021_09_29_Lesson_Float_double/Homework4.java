package Lesson_5_double;
// find the ratio of the square between Belarus and Ukraine.

public class Homework4 {
    public static void main(String[] args) {
        double belarusSquare = 207600;
        double ukraineSquare = 603549;
        System.out.println("ratio = " + ratioCalculation(belarusSquare, ukraineSquare));
    }

    public static double ratioCalculation(double a, double b) {
        return a / b;
    }
}
