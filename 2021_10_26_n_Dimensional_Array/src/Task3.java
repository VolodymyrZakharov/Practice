public class Task3 {
    // Функция принимает одномерный массив и меняет все элементы с нечетными индексами на 0.

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, -3, 4, -6};
        multiply3(array);
        arrayPrint(array);
    }

    static void multiply3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 !=0) {
                array[i] = 0;
            }
        }
    }

    static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
