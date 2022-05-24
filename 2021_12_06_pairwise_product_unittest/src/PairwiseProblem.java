public class PairwiseProblem {
    /**
     * The method must calculate the max pairwise product from the array with only none-negative numbers
     *
     * @param array the array to find product from
     * @return max pairwise product
     */
    public long solve(int[] array) {
        long result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                long multiplication = (long) array[i] * array[j];
                if (multiplication > result) {
                    result = multiplication;
                }
            }
        }
        return result;
    }

    public long solveNew(int[] array) {
        int max1 = array[0];
        int n = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max1) {
                max1 = array[i];
                n = i;
            }
        }

        array[n] = array[0];
        array[0] = max1;

        int max2 = array[1];
        for (int i = 2; i < array.length; i++) {
            if (array[i] > max2) {
                max2 = array[i];
            }
        }
        return (long) max1 * max2;
    }
}