import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class SalaryCollector implements Collector<Person, List<Person>, Integer> {
    @Override
    public Supplier<List<Person>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Person>, Person> accumulator() {
        return List::add;
    }

    @Override
    public BinaryOperator<List<Person>> combiner() {
        return (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<Person>, Integer> finisher() {
        return (personList) -> {
            int res =
                    personList.stream()
                            .map(Person::getSalary)
                            .reduce((x, y) -> x + y).get();
            return res;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(Set.of(Collector.Characteristics.CONCURRENT));
    }
}
