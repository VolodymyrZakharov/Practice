import java.util.*;

public class Task1 {
    public static void main(String[] args) {
    /* Написать метод, принимающий лист слов, а возвращающий TreeMap, ключами которого являются буквы,
     a значениями - листы слов, начинающихся с данной буквы и расположенных в лексикографическом порядке
      ({hello, world, hell} -> {h: [hell, hello], w: [world]}) */

        List<String> list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("hell");
        list.add("helz");
        list.add("aelz");
        list.add("aalz");

        System.out.println(method(list));
    }

    public static TreeMap<Character, List<String>> method(List<String> list) {

        TreeMap<Character, List<String>> treeMap = new TreeMap<>();

        for (int i = 0; i < list.size(); i++) {
            char a = list.get(i).toCharArray()[0];
            if (!treeMap.containsKey(a)) {
                List<String> valueList = new ArrayList<>();
                valueList.add(list.get(i));
                treeMap.put(a, valueList);
            } else {
                List<String> newValueList = treeMap.get(a);
                newValueList.add(list.get(i));
                Collections.sort(newValueList);
                treeMap.put(a, newValueList);
            }
        }
        return treeMap;
    }
}
