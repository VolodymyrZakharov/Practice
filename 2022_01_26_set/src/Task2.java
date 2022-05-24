import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
    /* Есть класс автомобиль, в котором есть два три поля: Марка, Модель, Цена.
    Написать функцию, которая принимает лист автомобилей, а возвращает TreeMap,
    ключами которого являются марки автомобилей, а значениями будут TreeSet автомобилей,
    в котором автомобили расположены в лексикографическом порядке относительно модели, причем дешевые вперед
    (необходимо написать правильный компаратор, который будет складывать автомобили в TreeSet в правильном порядке) */

        Auto mersedes1 = new Auto("Mersedes", "GLE", 50000);
        Auto mersedes2 = new Auto("Mersedes", "GLE", 70000);
        Auto mersedes3 = new Auto("Mersedes", "GLE", 100000);
        Auto mersedes4 = new Auto("Mersedes", "Maybach", 100000);
        Auto mersedes5 = new Auto("Mersedes", "Benz", 100000);
        Auto opel1 = new Auto("Opel", "zafira1", 20000);
        Auto opel2 = new Auto("Opel", "zafira2", 30000);
        Auto opel3 = new Auto("Opel", "zafira3", 40000);
        Auto opel4 = new Auto("Opel", "zafira4", 50000);


        List<Auto> autoList = new ArrayList<Auto>();
        autoList.add(mersedes1);
        autoList.add(mersedes2);
        autoList.add(mersedes3);
        autoList.add(mersedes4);
        autoList.add(mersedes5);
        autoList.add(opel1);
        autoList.add(opel2);
        autoList.add(opel3);
        autoList.add(opel4);

        System.out.println(method2(autoList));
    }

    public static TreeMap<String, TreeSet<Auto>> method2(List<Auto> list) {
        TreeMap<String, TreeSet<Auto>> treeMap = new TreeMap<>();

        for (Auto auto : list) {
            if (treeMap.containsKey(auto.mark)) {
                TreeSet<Auto> treeSet = treeMap.get(auto.mark);
                treeSet.add(auto);
                treeMap.put(auto.mark, treeSet);
            } else {
                TreeSet<Auto> newTreeSet = new TreeSet<>(new  AutoComparator());
                newTreeSet.add(auto);
                treeMap.put(auto.mark, newTreeSet);
            }
        }
        return treeMap;
    }

    static class Auto {
        String mark;
        String model;
        int price;

        public Auto(String mark, String model, int price) {
            this.mark = mark;
            this.model = model;
            this.price = price;
        }

        @Override
        public String toString() {
            return mark + " " + model + " " + price;
        }
    }
}
