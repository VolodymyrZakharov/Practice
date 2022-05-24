public class Task2 {
    // Написать функцию, которая распечатывает все числа от A до B с щагом D.
    // (функция принимает три аргумента: A, B, D, причем A > B и D > 0)
    public static void main(String[] args) {
        printNumbersWithStepD(30, 5, 5);
    }

    public static void printNumbersWithStepD(int a, int b, int d) {
        for (int number = a; number > b; number -= d) {
            System.out.print(number + " ");
        }
    }
}
