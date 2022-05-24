public class Task6 {
// (*) развернуть массив. static void function(int[]array) {5, 10, 7, 15} -> {15, 7, 10, 5}

    public static void main(String[] args) {
        int[] array1 = new int[]{5, 10, 0, 15, 7};
        reversArray(array1);
        printArray(array1);
    }

    static int[] reversArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            int b = array[array.length - 1 - i];
            array[i] = b;
            array[array.length - 1 - i] = a;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i += 1) {
            System.out.print(array[i] + " ");
        }
    }
}

