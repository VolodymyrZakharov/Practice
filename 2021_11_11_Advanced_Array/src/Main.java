public class Main {

    public static void main(String[] args) {
/*
        CustomList<Integer> list = new CustomArrayList<>();
        list.add(10);
        list.add(15);
        list.add(3);//{10, 15, 3}
        System.out.println(list.removeById(0));
        list.println();
*/
        CustomList<Integer> list1 = new CustomLinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        //list1.add(4);
        //list1.add(5);
        //System.out.println(list1.removeByValue(1));
        list1.println();
        //System.out.println(list1.removeById(0));
        //list1.println();
        //System.out.println(list1.removeById(1));
        //list1.println();
        //System.out.println(list1.contains(5));
list1.insert(0, 8);
list1.println();

    }
}