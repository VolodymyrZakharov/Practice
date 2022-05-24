public class Task4 {
    // Функция принимает двумерный массив и возвращает да или нет, есть ли отрицательные элементы в нем. static boolean function (int[][] arr)

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, -9, 10}
        };
        isNegativeElementInside(array);
        System.out.println(isNegativeElementInside(array));
    }

    static boolean isNegativeElementInside(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
