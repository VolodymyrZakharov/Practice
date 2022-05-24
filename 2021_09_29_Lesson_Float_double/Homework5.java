package Lesson_5_double;
// Find how many times the square of Moscow is larger than the square of Berlin.

public class Homework5 {
    public static void main(String[] args) {
        int moscowSquare = 2511;
        double berlinSquare = 891.8;
        System.out.println("Moscow is " + ratioCalculation(moscowSquare, berlinSquare) + " times bigger than Berlin");
    }

    public static int ratioCalculation(int a, double b) {
        return (int) (a / b); // нахожу целое количество раз по примеру задачи с айфоном
    }
}
