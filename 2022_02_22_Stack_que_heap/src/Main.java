import java.sql.Time;
import java.util.Date;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        char[] array = {'(', '[', '{', '}', ']', ')'};
        System.out.println(Task1.areBracketsCorrect(array));

        Date one = new Date(122, 1, 22, 12, 15, 0);
        Date two = new Date(122, 1, 22, 12, 18, 0);
        Date three = new Date(122, 1, 22, 12, 24, 0);
        Date four = new Date(122, 1, 22, 12, 36, 0);
        Date five = new Date(122, 1, 22, 12, 41, 0);
        Date six = new Date(122, 1, 22, 12, 49, 0);
        Date seven = new Date(122, 1, 22, 12, 50, 0);
        Date eight = new Date(122, 1, 22, 12, 54, 0);
        Date nine = new Date(122, 1, 22, 12, 59, 0);

        long[] array1 = new long[]{one.getTime(), two.getTime(), three.getTime(), four.getTime(), five.getTime(), six.getTime(), seven.getTime(), eight.getTime(), nine.getTime()};

        int[] res1 = Task2.countOrderNumbers(array1, 20);
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + " ");
        }
        System.out.println();
        int[] res2 = Task2.countOrderNumbers2(array1, 20);
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + " ");
        }


        System.out.println();

        int[] heap = {45, 30, 35, 20, 21, 34, 33, 15, 5, 17};
        int[] arr = {17, 5, 15, 33, 34, 21, 20, 35, 30, 45};
        int[] arr1 = {17, 5, 123, 33, 12, 7, 20, 65, 30, 22, 22, 22, -33};

        HeapService hp = new HeapService();
        hp.makeHeap(arr1);
        hp.heapSort(arr1);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
