public class Task2 {
    // сложить числа в двумерном массиве только из тех подмассивов, где нету отрицательных элементов.

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, 0, 0},
                {6, 7, 8, -9, 10},
                {6, 7, 8, -56, 10},
                {1, 1, 1, 1, 10}
        };
        quantityOfNegativeSubArray(array);
        System.out.println(quantityOfNegativeSubArray(array));

        sumNumbersFromSubArraysWithoutNegatives(array);
        System.out.println(sumNumbersFromSubArraysWithoutNegatives(array));
    }

    static int quantityOfNegativeSubArray(int[][] array) {
        int sum = 0;
        outerFor:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    continue outerFor;
                }
            }
            for (int k = 0; k < array[i].length; k++) {
                sum += array[i][k];
            }
        }
        return sum;
    }

    static int sumNumbersFromSubArraysWithoutNegatives(int[][] array) {
        int sum = 0;

        outerFore:
        for (int i = 0; i < array.length; i++) {
            int localSum = 0;

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0)
                    continue outerFore;
                else
                    localSum += array[i][j];
            }
            sum += localSum;
        }
        return sum;
    }
}
