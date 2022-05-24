public class Task2 {
    // Написать функцию, которая распечатывает все числа от A до B с щагом D.
    // (функция принимает три аргумента: A, B, D, причем A > B и D > 0)
    public static void main(String[] args) {
        int numberA = 86;
        int numberB = 6;
        int stepD = 5;
        function(numberA, numberB, stepD);

    }

    public static void function(int a, int b, int d) {
        while (a > b & d > 0) {
            System.out.print(a + " ");
            a -= d;
        }
    }
}
