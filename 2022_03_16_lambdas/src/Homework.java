import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;

public class Homework {

    public static void main(String[] args) {

        List<String> someList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            someList.add("Vasya " + i);
            someList.add("Vasya " + i);
        }
        System.out.println(someList);

        Function<List<String>, List<String>> uniqueList = (List<String> list) -> {
            HashSet<String> hashSet = new HashSet<>(list);
            List<String> newList = new ArrayList<>(hashSet);
            return newList;
        };
        System.out.println(uniqueList.apply(someList));
    }
}
