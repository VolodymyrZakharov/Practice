public class Main {

    public static void main(String[] args) {

        System.out.println(findFibonacciNumber(13));
        System.out.println(findLastFibonacciNumber(13));
    }

    public static int findFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return findFibonacciNumber(n - 1) + findFibonacciNumber(n - 2);
    }

    public static int findLastFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return (findFibonacciNumber(n - 1) + findFibonacciNumber(n - 2)) % 10;
    }


}
