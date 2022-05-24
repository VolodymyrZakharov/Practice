import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Task3 {

    public static void main(String[] args) {
        //Написать интерфейс TernaryIntPredicate с методом bool test(int a, int b, int c).
        // Написать лямбда выражение, которое вернет true, если все аргументы различны.

        TernaryIntPredicate ternaryIntPredicate = (a,b,c) ->a!=b && b !=c && a!=c;

        System.out.println(ternaryIntPredicate.test(1,2,4));
    }
}