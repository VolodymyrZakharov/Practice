public class Task4 {
    // Вывести на экран треугольник состоящий из цифр до числа n:
    public static void main(String[] args) {
        int number = 18;
        fanctionTriangle(number);
    }

    public static void fanctionTriangle(int number) {
        int a = 1;
        int b = 2;
        while (b <= number + 1) {
            while (a < b) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
            a = 1;
            b++;
        }
    }
}
