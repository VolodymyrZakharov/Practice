public class Classwork13 {
    // Написать метод находящий повторяющиеся значения массива и вывести их на экран
    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 4, -1, 5, 6, 8};
        theSameElements(array);
    }

    static void theSameElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}