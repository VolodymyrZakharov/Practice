public class Task1 {
    // (*) Рекурсивно решить задачу x^n

    public static void main(String[] args) {
        System.out.println(findValue(6, 2));
    }

    static int findValue(int n, int x) {
        if (n == 0)
            return 1;

        int result = x * findValue(n - 1, x);
        return result;
    }
}
