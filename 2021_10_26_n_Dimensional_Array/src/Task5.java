public class Task5 {
    // Функция принимает двумерный массив и возвращает количество подмассивов (строк),
    //в которых есть отрицательные элементы (использовать break). static int function (int [][] arr)

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, -4, -5},
                {6, 7, 8, 9, 10},
                {6, 7, 8, 56, 10},
                {6, 12, 8, -9, 10}
        };
        quantityOfNegativeSubArray(array);
        System.out.println(quantityOfNegativeSubArray(array));
    }

    static int quantityOfNegativeSubArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    sum += 1;
                    break;
                }
            }
        }
        return sum;
    }
}
