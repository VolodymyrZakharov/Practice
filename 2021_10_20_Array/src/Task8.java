public class Task8 {
// заменить все отрицательные элементы на абсолютное значение (-3 -> 3, -239 -> 239)

    public static void main(String[] args) {
        int[] array1 = new int[]{-5, -10, -7, 15};
        replaceNegativeElements(array1);
        printArray1(array1);
    }

    public static void replaceNegativeElements(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (array[i] < 0) {
                array[i] = -array[i];
            }
            i++;
        }
    }

    public static void printArray1(int array[]) {
        for (int i = 0; i < array.length; i += 1) {
            System.out.print(array[i] + " ");
        }
    }
}
