package Lesson_7_Exercises;

public class Homework4 {
    public static void main(String[] args) {
        int number = 365;
        showNumbers(number);
    }

    // Вывести на экран все цифры этого числа
    public static void showNumbers(int number) {
        int a = number / 100;
        int b = number % 100;
        int c = b / 10;
        int d = b % 10;
        System.out.println("First number = " + a);
        System.out.println("Second number = " + c);
        System.out.println("Third number = " + d);
        showNewNumber(a, c, d);
    }

    // Получить новое число, образованное перестановкой единиц и сотен и вывести его на экран
    public static void showNewNumber(int a, int c, int d) {
        int newNumber = d * 100 + c * 10 + a;
        System.out.println("New number = " + newNumber);
        showSum(a, c, d);
    }

    // Вывести на экран сумму цифр числа
    public static void showSum(int a, int c, int d) {
        int summ = a + c + d;
        System.out.println("Sum = " + summ);
    }
}
