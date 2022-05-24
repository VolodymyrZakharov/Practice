public class Task1 {
    // Написать функцию, которая распечатывает все числа от A до B с щагом D.
// (функция принимает три аргумента: A, B, D, причем A < B и D > 0)
    public static void main(String[] args) {
        printNumbersWithStepD(5, 30, 5);
    }

    public static void printNumbersWithStepD(int a, int b, int d) {
        for (int number = a; number < b & d > 0; number += d) {
            System.out.print(number + " ");
        }
    }
}