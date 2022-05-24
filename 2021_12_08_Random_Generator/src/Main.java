import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        ListRandomRule one = new ListRandomRule(list);
        System.out.println(one.nextInt());

        IRandomRule maxRandomRule = new MaxRandomRule(10);
        RandomGenerator maxGenerator = new RandomGenerator(maxRandomRule);
        System.out.println(maxGenerator.generate(20));

        IRandomRule rangeRandomRule = new RangeRandomRule(5, 10);
        RandomGenerator rangeGenerator = new RandomGenerator(rangeRandomRule);
        System.out.println(rangeGenerator.generate(20));

        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        ListRandomRule listRandomRule = new ListRandomRule(array);
        System.out.println(listRandomRule.nextInt());
    }
}