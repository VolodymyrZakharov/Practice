public class Task2 {
    // Даны два целые числа а и в. Написать метод, возвращающий true если одно из чисел 10 или их сумма равна 10.
    public static void main(String[] arhs) {
        int a = 10;
        int b = 7;
        isSumEquelToTen(a, b);
        System.out.println(isSumEquelToTen(a, b));
    }

    public static boolean isSumEquelToTen(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }
}
