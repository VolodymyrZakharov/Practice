public class Classwork5 {
    // написать метод который находит максимальное значение массива
    public static void main(String[] args) {
        int[] arrray = new int[]{6, 10, 7, 6, 13, 6, 5};
        System.out.println(max(arrray));
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
