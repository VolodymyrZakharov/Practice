public class Classwork1 {
    // найти факториал числа
    // 5! = 1*2*3*4*5
    public static void main(String[] args) {
        long number = function(5);
        System.out.println(function(5));
    }

    // найти степень числа
    static long function(int n) {
        if (n == 1)
            return 1;

        long result = n * function(n - 1);
        return result;
    }
}