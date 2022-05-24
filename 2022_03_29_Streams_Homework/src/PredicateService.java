import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class PredicateService {

    /**
     * @param predicates a list of predicates
     * @param <T>        type of predicates
     * @return the union of the list. If no items in the list, return false
     */
    public <T> Predicate<T> union(List<Predicate<T>> predicates) {
      return   predicates.stream()
                .reduce(Predicate::or).orElseThrow(NoSuchElementException::new);
    }

    /**
     * @param predicates a list of predicates
     * @param <T>        type of predicatesdfgsw
     * @return the intersection of the list of predicates
     * @throws IllegalArgumentException if no items in the list
     */
    public <T> Predicate<T> intersect(List<Predicate<T>> predicates) {

       return predicates.stream()
                .reduce(Predicate::and)
               .orElseThrow(NoSuchElementException::new);
    }
}
