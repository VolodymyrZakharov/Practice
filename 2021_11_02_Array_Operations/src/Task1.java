public class Task1 {
    // Есть двумерный массив. Посчитать сумму только тех элементов, которые лежат в подмассивах, в которых есть положительные элементы

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 1, 1, 1, -1},
                {-1, -1, -1, -1, -1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        System.out.println(sumOfArraysWithPositiveElements(array));
        System.out.println(sumOfSubArrays(array));
    }

    static int sumOfArraysWithPositiveElements(int[][] array) {
        int sum = 0;
        OuterFore:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    for (int k = 0; k < array[i].length; k++) {
                        sum += array[i][k];
                    }
                    continue OuterFore;
                }
            }
        }
        return sum;
    }

    static int sumOfSubArrays(int[][] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            int subArraySum = 0;
            boolean isPositive = false;

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0)
                    isPositive = true;
                subArraySum += array[i][j];
            }
            if (isPositive)
                res += subArraySum;
        }
        return res;
    }
}
