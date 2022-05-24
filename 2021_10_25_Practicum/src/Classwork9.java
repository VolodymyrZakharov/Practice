public class Classwork9 {
    // Написать метод, находящий количество четных значений в данном двумерном массиве целых чисел
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {4, 6, 3, 2, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7}
        };
        qantityOfEvenElements(array);
        System.out.println(qantityOfEvenElements(array));
    }

    static int qantityOfEvenElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
