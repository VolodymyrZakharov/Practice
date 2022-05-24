import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> list = new ArrayList<>();
        list.add("ivan");
        list.add("vova");
        list.add("sasha");
        list.add("vova");
        list.add("olga");
        list.add("olga");

        System.out.println(method1("ivan", list));
        System.out.println(method2(list));
        System.out.println(method3(list));
    }

    public static List<String> method1(String name, List<String> list) {
        List<String> res = new ArrayList<>();
        char[] nameArray = name.toCharArray();
        Arrays.sort(nameArray);

        for (String names : list) {
            char[] array = names.toCharArray();
            Arrays.sort(array);
            if (Arrays.equals(nameArray, array))
                res.add(names);
        }
        return res;
    }

    public static List<String> method2(List<String> list) {
        List<String> res = new ArrayList<>();
        Set<String> set = new TreeSet<>();
        for (String str : list) {
            set.add(str);
        }
        for (String st : set) {
            res.add(st);
        }
        return res;
    }

    //3.с использованием множеств написать метод, который вернет повторяющиеся
    // элементы из данного листа
    //List<String> getDuplicates(List<String> input)
    // {"Ivan", "Maria","Piotr","Anna","Maria","Ivan"}->{Ivan, Maria}

    public static List<String> method3(List<String> list) {
        List<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (String str : list) {
            if (!set.add(str) && !res.contains(str)) {
                res.add(str);
            }
        }
        return res;
    }
}
