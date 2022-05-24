public class Classwork10 {
    // Написать метод, для подсчета разницы между максимальным и минимальным значениями массива целых чисел
    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 3, 0, 5, 6, 8};
        findDifference(array);
        System.out.println(findDifference(array));
    }

    static int findDifference(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                min = array[i];
            } else {
                max = array[i];
            }
        }
        return max - min;
    }
}
