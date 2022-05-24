public class Classwork8 {
    // Найти второе по велечине число в массиве целых чисел
    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 3, 2, 5, 7, 7};
        findSecondValue(array);
    }

    static void findSecondValue(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }

        for (int j = array.length - 2; j < array.length; j--) {
            if (array[array.length - 1] != array[j]) {
                System.out.println(array[j]);
                break;
            }
        }
    }
}
