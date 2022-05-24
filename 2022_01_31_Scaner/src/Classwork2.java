import java.util.Scanner;

public class Classwork2 {

    Scanner con;

    Classwork2() {
        con = new Scanner(System.in);
    }

    int readNext(int number) {
        System.out.println("\nВведите элемент № " + number + ": ");
        int result = con.nextInt();
        return result;
    }

    int searchMax() {
        System.out.println("Введите количество элементов последовательности: ");
        int N = con.nextInt();

        int maxElem = readNext(1);
        int tmp;

        for (int i = 2; i <= N; i++) {
            tmp = readNext(i);
            if (tmp > maxElem) {
                maxElem = tmp;
            }
        }
        return maxElem;
    }
}
