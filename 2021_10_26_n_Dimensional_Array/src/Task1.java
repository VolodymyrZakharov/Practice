public class Task1 {
    // Создать двумерный массив 10x10 и заполнить его числами от 99 до 0 (в методе main)

    public static void main(String[] args) {
        int[][] array10x10 = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array10x10[i][j] = 99 - i * 10 - j;
            }
        }
        System.out.println();
    }
}
