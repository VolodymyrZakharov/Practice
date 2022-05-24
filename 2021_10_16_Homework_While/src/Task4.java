public class Task4 {
    // Написать функцию, которая распечатывает все числа от 1 до A, кратные 5, 7 или 13
    public static void main(String[] args) {
        int numberA = 130;
        int number = 1;
        while (number < numberA) {
            if (number % 5 == 0 || number % 7 == 0 || number % 13 == 0) {
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
