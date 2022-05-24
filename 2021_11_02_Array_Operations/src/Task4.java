public class Task4 {
    // (**) Написать Binary Search. static int binarySearch(int[] array, int number)
    // (см. условие 3 задачи из предыдущего дз, только реализовав алгоритм Binary Search)
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 9, 10, 11, 12, 13};
        int number = 56;

        System.out.print(returnIndex(array, number));
    }

    static int returnIndex(int[] array, int number) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (number == array[mid]) {
                return mid;
            } else if (number < array[mid]) {
                max = mid - 1;
            } else if (number > array[mid]) {
                min = mid + 1;
            }
        }
        return -(min + 1);
    }
}
