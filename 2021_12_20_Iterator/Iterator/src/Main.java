import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 7, 2};

        Iterator<Integer> iterator1 = new ForwardArrayIterator(array);
        Iterator<Integer> iterator2 = new BackwardArrayIterator(array);
        Iterator<Integer> iterator3 = new IncreasingArrayIterator(array);

        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();

        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();

        while (iterator3.hasNext()) {
            System.out.print(iterator3.next() + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(array));
    }
}
