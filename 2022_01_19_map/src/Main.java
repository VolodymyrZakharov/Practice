import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        for (Integer v: map.keySet() ) {
            System.out.println(v);
        }

        Iterator<Integer> keyIterator = map.keySet().iterator();

        while(keyIterator.hasNext()) {
            System.out.print(keyIterator.next() + " ");
        }
    }
}
