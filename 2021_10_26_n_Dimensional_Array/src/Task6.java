public class Task6 {
    // Функция принимает двумерный массив и возвращает количество подмассивов (строк),
    // в которых нет отрицательных элементов. static int function (int [][] arr)

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, -4, -5},
                {6, 7, 8, 9, 10},
                {6, 7, 8, 56, 10},
                {6, 12, 8, 9, 10}
        };
        quantityOfNegativeSubArray(array);
        System.out.println(quantityOfNegativeSubArray(array));
    }

    static int quantityOfNegativeSubArray(int[][] array) {
        int sum = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            while (j < array[i].length && array[i][j] >= 0) {
                j++;
            }
            if (j == array[i].length) {
                sum += 1;
            }
            j = 0;
        }
        return sum;
    }
}
