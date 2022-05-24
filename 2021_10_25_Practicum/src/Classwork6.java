public class Classwork6 {
    // вывести на экран треугольник цифр
    public static void main(String[] args) {
        int number = 9;
        function(number);
    }

    static void function(int number) {
        int a = 1;
        int b = 1;
        while (a <= number) {
            b = 1;
            while (b <= a) {
                System.out.print(1 * b + " ");
                b++;
            }
            a++;
            System.out.println();
        }
    }
}
