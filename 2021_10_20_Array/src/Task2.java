public class Task2 {
// Написать функцию, которая определяет, есть ли в массиве отрицательные элементы. static boolean function(int[] array)

    public static void main(String[] args) {
        int[] array1 = new int[]{4, 5, 8, 6, -1};
        isNegativeElementInside(array1);
        System.out.println(isNegativeElementInside(array1));
    }

    public static boolean isNegativeElementInside(int[] array) {
        int i = 0;
        while (i < array.length && array[i] >= 0) {
            i += 1;
        }
        if (i == array.length) {
            i -= 1;
        }
        return array[i] <= 0;
    }
}

