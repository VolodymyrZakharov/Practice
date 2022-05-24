public class ArraySort {
    // сортировать массив от меньшего к большему

    public static void main(String[] args) {
        int[] array = new int[]{12, 6, 7, 4, 10};
        function(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void function(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            int j = i;
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }
}
