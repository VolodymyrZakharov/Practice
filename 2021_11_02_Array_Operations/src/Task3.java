public class Task3 {
    /* Написать метод, который принимает отсортированный массив и число, и возвращает либо реальный индекс, по которому находится число,
    либо число, равное индексу, на который можно поставить элемент, не нарушая порядка, плюс 1 и с минусом. */

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 6, 7, 8};
        int number = 4;

        System.out.println(returnIndex(array, number));
        System.out.println(returnInd(array, number));
    }

    static int returnIndex(int[] array, int number) {
        int index = -(array.length + 1);
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return i;
            } else if (array[i] > number) {
                index = -(i + 1);
                break;
            }
        }
        return index;
    }

    static int returnInd(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i])
                return i;

            if (number < array[i])
                return -(i + 1);
        }
        return -(array.length + 1);
    }
}
