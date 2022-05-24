import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Set<Integer> numbers = new TreeSet<>();
        Set<Integer> numbers2 = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(6);
        numbers2.add(7);

        numbers.retainAll(numbers2);
        System.out.println(numbers);
    }
}
