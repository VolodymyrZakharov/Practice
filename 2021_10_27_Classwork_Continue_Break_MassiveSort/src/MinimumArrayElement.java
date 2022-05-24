public class MinimumArrayElement {
    // найти минимальный элемент массива

    public static void main(String[] args) {
        int[] array = new int[]{12, -6, 7, 4, 10};

        findMin(array);
        // printArray(array);
        System.out.println(findMin(array));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int findMin(int[] array) {
        int min = array[0];
        // Int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                // minIndex = i; индекс минимального элемента
            }
        }
        return min;
    }
}
