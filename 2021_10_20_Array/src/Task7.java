public class Task7 {
// заполнить массив элементами, равными 3 * на номер индекса

    public static void main(String[] args) {
        int[] array1 = new int[10];
        arrayMultiply3(array1);
        printArray(array1);
    }

    static void arrayMultiply3(int[] array) {
        for (int i = 0; i < array.length; i += 1) {
            array[i] = i * 3;
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i += 1)
            System.out.print(array[i] + " ");
    }
}

