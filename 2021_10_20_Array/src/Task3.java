public class Task3 {
    // --"-- есть ли в массиве нечетные элементы. static boolean function(int[] array)
    public static void main(String[] args) {
        int[] array1 = new int[]{6, 4, 6, 8, 9};
        isOddElementInside(array1);
        System.out.println(isOddElementInside(array1));
    }

    static boolean isOddElementInside(int[] array) {
        int i = 0;
        while (i < array.length && array[i] % 2 == 0) {
            i += 1;
        }
        if (i == array.length) {
            return false;
        } else {
            return true;
        }
    }
}
