public class Task3 {
    // Написать функцию, которая считает (отдает, возвращает - return) сумму чисел от A до B с шагом D.
    // (функция принимает три аргумента: A, B, D, причем A < B и D > 0)
    public static void main(String[] args) {
        int numberA = 5;
        int numberB = 15;
        int stepD = 4;
        sumOfNumbers(numberA, numberB, stepD);
        System.out.println(sumOfNumbers(numberA, numberB, stepD));
    }

    static int sumOfNumbers(int numberA, int numberB, int stepD) {
        int sum = numberA;
        int next = numberA + stepD;
        while (next < numberB & stepD > 0) {
            sum = sum + next;
            next = next + stepD;
        }
        return sum;
    }
}
