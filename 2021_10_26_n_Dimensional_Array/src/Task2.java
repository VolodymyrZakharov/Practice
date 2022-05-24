public class Task2 {
    // Функция принимает одномерный массив и умножает на 3 все его положительные элементы. static void function(int[] arr)

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, -3, 4, -5};
        multiply3(array);
        arrayPrint(array);
    }

    static void multiply3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                array[i] *= 3;
            }
        }
    }

    static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
