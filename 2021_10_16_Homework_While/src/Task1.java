public class Task1 {
    // Написать функцию, которая распечатывает все числа от A до B с щагом D.
    // (функция принимает три аргумента: A, B, D причем A < B и D > 0)
    public static void main(String[] args) {
        int numberA = 6;
        int numberB = 56;
        int stepD = 5;
        function(numberA, numberB, stepD);
    }

    public static void function(int a, int b, int c) {
        while (a < b & c > 0) {
            System.out.println(a);
            a = a + c;

        }
    }
}
