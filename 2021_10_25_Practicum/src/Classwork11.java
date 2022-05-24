public class Classwork11 {
    // Написать метод, проверяющий содержатся ли в массиве целых чисел 0 и -1
    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 0, -1, 5, 6, 8};
        function(array);
        System.out.println(function(array));
    }

    static boolean function(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == -1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
