import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {

    private final IRandomRule randomRule;

    public RandomGenerator(IRandomRule randomRule) {
        this.randomRule = randomRule;
    }

    /**
     * The method must generate n random numbers according to randomRule
     *
     * @param n
     * @return List<Integer>
     */
    public List<Integer> generate(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(randomRule.nextInt());
        }
        return numbers;
    }
}