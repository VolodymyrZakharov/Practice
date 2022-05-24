import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 6, 3, 4};
        printArray(case1(array, 5, 4));

        System.out.println();

        System.out.print(case2(new int[]{6, 42, 11, 1, 42}, 7, 42));
    }

    public static int[] case1(int[] array, int F, int M) {

        int arraySum = Arrays.stream(array).sum();
        int totalLength = array.length + F;
        int totalSum = M * totalLength;
        int restSum = totalSum - arraySum;

        int[] newArray = new int[F];
        int sum = 0;
        int num = F;
        for (int i = 0; i < F - 1; i++) {
            newArray[i] = (restSum - sum) / num;
            num--;
            sum += newArray[i];
        }
        newArray[F - 1] = restSum - sum;
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    //Есть массив целых чисел. Петя и Вася задумывают по своему любимому числу. Найти наибольшую длину префикса этого массива,
    // такого, что он (префикс массива) содержит поровну любимого числа Васи и Пети. Если такового префикса не существует,
    // вывести -1. (7, 42, {6, 42, 11, 7, 1, 42})) -> 5 ; (7, 42, new int[]{7, 42, 11, 7, 1, 42})) -> 6

    public static int case2(int[] array, int a, int b) {
        int res = 0;
        int a1 = 0;
        int b1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a)
                a1++;
            if (array[i] == b)
                b1++;
            if (a1 == b1)
                res = i + 1;
        }
        if (a1 == 0 || b1 == 0) {
            return 0;
        }
        return res;
    }
}
