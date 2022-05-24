public class Classwork12 {
    // Написать метод проверяющий равенство двух массивов
    public static void main(String[] args) {
        int[] array1 = new int[]{4, 6, 0, -1, 5, 6, 8};
        int[] array2 = new int[]{4, 6, 0, -1, 5, 6, 8};
        areTheArraysEqual(array1, array2);
        System.out.println(areTheArraysEqual(array1, array2));
    }

    static boolean areTheArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
