import java.util.function.Function;

public class Task4 {
    // Написать функцию, которая считает <2x> и функцию, которая считает <x + 3>. Написать функцию, которая будет композицией первых двух.
    public static void main(String[] args) {
        Function<Integer, Integer> a = (x) -> 2 * x;
        Function<Integer, Integer> b = (x) -> x + 3;
        Function<Integer, Integer> c = a.compose(b);

        System.out.println(c.apply(2));
    }
}
