import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static Map<String, Boolean> task2(String[] array) {

        Map<String, Boolean> map = new HashMap<>();

        for (String key : array) {
            if (map.containsKey(key))
                map.put(key, true);
            else map.put(key, false);
        }
        return map;
    }
}
