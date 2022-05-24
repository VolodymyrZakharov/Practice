public class Main {

    public static void main(String[] args) {
        int number = function(3);
        System.out.println(function(3));
    }

    // найти степень числа
    static int function(int n) {
        if (n == 0)
            return 1;

        int result = 2 * function(n - 1);
        return result;
    }
}
