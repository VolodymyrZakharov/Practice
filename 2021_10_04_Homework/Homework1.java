package Lesson_7_Exercises;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("50 / 3 = " + function1(50, 3));
        System.out.println("-5 + 8 * 6 = " + function2(-5, 8, 6));
        System.out.println("(55 + 9) % 9 = " + function3(55, 9, 9));
        int x = 7;
        System.out.println("x^2 = " + function4(x));
    }

    public static int function1(int a, int b) {
        return a / b;
    }

    public static int function2(int a, int b, int c) {
        return a + b * c;
    }

    public static int function3(int a, int b, int c) {
        return (a + b) % c;
    }

    public static int function4(int a) {
        return (a * a);
    }
}
