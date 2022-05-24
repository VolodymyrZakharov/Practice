
import java.util.Scanner;

public class Classwork3 {
    Scanner sc;

    public Classwork3() {
        sc = new Scanner(System.in);
    }

    int method1(int number) {
        System.out.println("\nВведите элемент № " + number + ": ");
        int m = sc.nextInt();
        return m;
    }


    void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите кол-во элементов");
        int N = sc.nextInt();

        int[] array = new int[N];

        for (int i = 1; i <= N; i++) {
            array[i - 1] = method1(i);
        }

        for (int j = 0; j < array.length; j++) {
            if ((array[j] % 2) == 0) {
                System.out.print(array[j]);
            }
        }
    }
}
