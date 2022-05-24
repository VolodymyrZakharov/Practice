package Lesson_7_Exercises;

public class Task2 {
    public static void main(String[] args) {
        double a = 10.5;
        double b = 7.7;
        System.out.println(summ(a, b));
        System.out.println(part(a, b));
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(Math.floor(summ(a,b)));
        System.out.println(Math.ceil(summ(a,b)));
    }

    public static double summ(double x, double y) {
        double result = x + y;
        return result;
    }

    public static int part(double z, double q) {
        double result2 = z + q;
        return (int) result2;
    }
}
