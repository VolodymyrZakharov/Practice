import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {

    public static int nameByNumber(List<String> list, String name) {
        Map<String, Integer> map = new HashMap<>();

        for (String keyName : list)
            if (map.containsKey(keyName)) {
                int oldValue = map.get(keyName);
                map.put(keyName, oldValue + 1);
            } else {
                map.put(keyName, 1);
            }
        return map.get(name);
    }
}
