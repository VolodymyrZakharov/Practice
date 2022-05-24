public class Continue {
    // сложить все нечетные числа от 1 до n

    public static void main(String[] args) {
        int number = 10;
        function(number);

    }

    public static int function(int number) {
        int res = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0)
                continue;// go to the next iteration
            res += 1;
        }
        return res;
    }
}
