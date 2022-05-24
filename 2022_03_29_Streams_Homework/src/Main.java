import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        PredicateService predicateService = new PredicateService();

        List<Predicate<Integer>> predicates = Arrays.asList(x -> x % 2 == 0, x -> x % 4 == 0);

        Predicate<Integer> result1 = predicateService.intersect(predicates);
        Predicate<Integer> result2 = predicateService.union(predicates);

        System.out.println("Predicate Service - intersect");
        System.out.println(result1.test(2)); // false
        System.out.println(result1.test(4)); // true
        System.out.println("Predicate service - union");
        System.out.println(result2.test(2)); // true
        System.out.println(result2.test(4)); // true
        System.out.println(result2.test(3)); // false
    }
}
