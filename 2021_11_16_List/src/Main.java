import list.AdvancedArrayList;
import list.CustomList;
import list.Circle1;
import list.Formula;

public class Main {

    public static void main(String[] args) {

        CustomList list = new AdvancedArrayList();

        CustomList array = new AdvancedArrayList(5);

        list.add(10);
        list.add(15);
        list.add(3);//{10, 15, 3}

        list.set(0, 20);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.contains(20));
        list.removeById(0);
        list.add(12);
        list.insert(2, 55);
        list.println();

    }
}
