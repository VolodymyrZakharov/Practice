public class Continue {
    // сложить все нечетные числа от 1 до n

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0}
        };
        function(array);
    }

    public static int function(int[][] array) {
        int res = 0;
        outerFor:
        for (int i = 0; i <= array.length; i++) {
            for (int j = 0; j <= array[i].length; j++)
                if (array[i][j] < 0) {
                    res++;
                    continue outerFor;
                }
        }
        return res;
    }
}
