public class Task3 {
    // Написать функцию, которая считает (отдает, возвращает - return) сумму чисел от A до B с шагом D.
    // (функция принимает три аргумента: A, B, D, причем A < B и D > 0)
    public static void main(String[] args) {
        int a = 5;
        int b = 30;
        int d = 5;
        calculateSum(a,b,d);
        System.out.println(calculateSum(a, b, d));
    }

    public static int calculateSum(int a, int b, int d) {
        int sum = 0;
        for (int curentNumber = a; curentNumber < b & d > 0; curentNumber += d) {
            sum += curentNumber;
        }
        return sum;
    }
}
