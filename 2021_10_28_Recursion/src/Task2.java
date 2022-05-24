public class Task2 {
    // (*) n! (1*2*...(n-1)n )

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }

    static long findFactorial(int n) {
        if (n == 1)
            return 1;

        long result = n * findFactorial(n - 1);
        return result;
    }
}
