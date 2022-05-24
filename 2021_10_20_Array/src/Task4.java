public class Task4 {
// --"-- есть ли в массиве заданное число. static boolean function(int[] array)

    public static void main(String[] args) {
        int number = 5;
        int[] array1 = new int[]{2, 0, 6, 8, 8};
        isNumberInside(array1, number);
        System.out.println(isNumberInside(array1, number));
    }

    static boolean isNumberInside(int[] array, int number) {
        int i = 0;
        while (i < array.length && array[i] != number) {
            i += 1;
        }
        if (i == array.length) {
            return false;
        } else {
            return true;
        }
    }
}
