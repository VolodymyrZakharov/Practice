public class Task7 {
    // сложить числа в двумерном массиве только из тех подмассивов, где нету отрицательных элементов.

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, -4, -5},
                {0, 0, 1, 1, 0},
                {6, 7, 8, -56, 10},
                {0, 0, 0, 0, 1}
        };
        someOfPositiveArrays(array);
        System.out.println(someOfPositiveArrays(array));
    }

    static int someOfPositiveArrays(int[][] array) {
        int sum = 0;
        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            while (j < array[i].length && array[i][j] >= 0) {
                j++;
            }
            if (j == array[i].length) {
                while (k < array[i].length) {
                    sum += array[i][k];
                    k++;
                }
            }
            j = 0;
            k = 0;
        }
        return sum;
    }
}

