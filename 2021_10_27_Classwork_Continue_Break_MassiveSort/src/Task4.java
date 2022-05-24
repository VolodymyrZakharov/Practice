public class Task4 {
    // (*) Написать сортировку выбором (Selection Sort)
    public static void main(String[] args) {
        int[] array = new int[]{4, 7, 2, -6, 1, 5, 87, -87};
        sortArray(array);
        printArray(array);

        
    }

    static void sortArray(int[] array) {
        int i = 0;
        while (i < array.length) {
            int temp = array[i];
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            array[i] = min;
            array[minIndex] = temp;
            i++;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
