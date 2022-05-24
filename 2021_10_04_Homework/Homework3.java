package Lesson_7_Exercises;

public class Homework3 {
    public static void main(String[] args) {
        int firstItem = 1000;
        int secondItem = 500;
        int discount = 100;
        System.out.println("Price with discount = " + priceWithDiscount(firstItem, secondItem));
        System.out.println("Discount value = " + discount);
    }

    public static int priceWithDiscount(int a, int b) {
        return a + b - 100;
    }
}
