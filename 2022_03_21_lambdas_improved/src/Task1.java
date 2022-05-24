import java.util.function.*;

public class Task1 {

    public static void main(String[] args) {
        // Используя замыкание, написать Function<Double, Double>, которая считает ax^2 + bx + c
        final int a = 5;
        final int b = 6;
        final int c = 7;
        Function<Double, Double> task1 = (x) -> a * x * x + b * x + c;
        System.out.println(task1.apply(1.0));

    }
}