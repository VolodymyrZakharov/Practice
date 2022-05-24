import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static Map<String, String> task1(Map<String, String> map, String key1, String key2) {

        if (map.containsKey(key1) & map.containsKey(key2)) {
            map.put(key1.concat(key2), key1.concat(key2));
            return map;
        } else
            return map;
    }
}
