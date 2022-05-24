public class Task4 {
// Написать функцию, которая распечатывает все числа от 1 до A, кратные 5, 7 или 13

    public static void main(String[] args) {
        printNumbers(13);
    }

    public static void printNumbers(int a) {

        for (int number = 1; number <= a; number++) {
            if (number % 5 == 0 || number % 7 == 0 || number % 13 == 0)
                System.out.println(number + " ");
        }
    }
}
