public class Task3 {
    // (*) Найти НОД двух целых положительных чисел (алгоритм Эвклида) - рекурсивно или нет.
    public static void main(String[] args) {
        System.out.println(findNod(1071, 462));
    }

    static int findNod(int n, int x) {
        if (n % x == 0) {
            return x;
        } else
            return findNod(x, n % x);
    }
}
