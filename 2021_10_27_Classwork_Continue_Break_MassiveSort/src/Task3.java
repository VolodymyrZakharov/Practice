public class Task3 {
    // написать ф-ю, которая ищет (возвращает) n-ое число Фибоначчи.
    public static void main(String[] args) {
        int number = 8;
        fibonacciNumber(number);
        System.out.println(fibonacciNumber(number));

        fibonacyArray(number);
        System.out.println(fibonacyArray(number));
    }

    static int fibonacciNumber(int number) {
        int result = 0;
        int a = 0;
        int b = 1;
        for (int i = 1; i < number; i++) {
            result = a + b;
            b = a;
            a = result;
        }
        return result;
    }

    static long fibonacyArray(int n) {
        if (n == 0)
            return 0;
        long[] fibonaccies = new long[n + 1];
        fibonaccies[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonaccies[i] = fibonaccies[i - 1] + fibonaccies[i - 2];
        }
        return fibonaccies[n];
    }
}
