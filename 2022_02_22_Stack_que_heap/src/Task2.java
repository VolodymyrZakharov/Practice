import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Task2 {
    /**
     * В ресторан периодически попадает заказ. У заказа есть время когда он был заказан (miliseconds from 1 Jan 1980).
     * Для каждого заказа нужно установить кол-во заказов сделаных за 15 минут до него.
     */
    public static int[] countOrderNumbers(long[] orderTimes, int minutes) {
        int[] res = new int[orderTimes.length];

        int count = -1;
        for (int i = 0; i < res.length; i++) {
            for (int j = i; j >= 0 && orderTimes[i] <= (orderTimes[j] + minutes * 60000L); j--) {
                count++;
            }
            res[i] = count;
            count = -1;
        }
        return res;
    }

    public static int[] countOrderNumbers2(long[] orderTimes, int minutes) {
        int[] res = new int[orderTimes.length];
        long time = minutes * 60000L;
        Deque<Long> queue = new ArrayDeque<>();
        int i = 0;

        for (long orderTime : orderTimes) {
            queue.addLast(orderTime);
            if (queue.getLast() > queue.getFirst() + minutes) {
                queue.removeFirst();
                res[i++] = queue.size();
            }
        }
        return res;
    }
}
