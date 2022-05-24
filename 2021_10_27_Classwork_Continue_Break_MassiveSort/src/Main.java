public class Main {

    public static void main(String[] args) {
        int array[][] = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = 99 - 10 * i - j;
            }
        }
        print2DimArray(array);
    }

    static void print2DimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
