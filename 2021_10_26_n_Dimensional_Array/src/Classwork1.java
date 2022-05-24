import javax.swing.*;

public class Classwork1 {

    public static void main(String[] args) {
        int[] array = new int[]{4, 7, 3};
        int[] array2 = array;

        int[][] dim2Array = new int[][]{
                {1, 7, 3},
                {-10, 18},
                {2, 5, 18, 13}
        };
        System.out.println(dim2Array.length);

        int[] secondSubArray = dim2Array[2]; // {2,5,18,13}
        int secondSubArrayLength = dim2Array[2].length;
        System.out.println(secondSubArray);

        int number = dim2Array[2][3]; // 13
        System.out.println(number);

        int[][] dim2OtherArray = new int[10][];
        dim2OtherArray[0] = new int[]{3, 6, 1};
        dim2OtherArray[1] = secondSubArray;

        int[][] dim2YetAnotherArray = new int[10][4];

        int[][][] dim3Array = new int[][][]{
                {
                        {1, 7, 3},
                        {-10, 18},
                        {2, 5, 18, 13}
                },
                {
                        {-11, 1},
                        {-2, 5, 13},
                },
        };
        System.out.println(dim3Array.length); // 2
        System.out.println(dim2Array[0].length);//3
        System.out.println(dim3Array[0][2][3]);//13

        int[][][] dim3OtherArray = new int[3][5][10];


        // fill a 10x10 array with numbers from 0 to 99

        int[][] array10x10 = new int[10][10];

        for (int i = 0; i < array10x10.length; i++) {
            for (int j = 0; j < 10; j++) {
                array10x10[i][j] = i * 10 + j;
            }
        }
        System.out.println();
    }
}
