public class Classwork1 {
    public static void main(String[] args) {
        printArithmeticalProgression(1, 15, 3);
    }

    /**
     * The method prints out all numbers from a to b with the step d
     * @param a starting point
     * @param b the greatest possible number, must be greater than a
     * @param d the step, must be positive. Otherwise the behaviour of the method unpredictable
     */
    static void printArithmeticalProgression(int a, int b, int d) {
        int currentNumber = a;
        while(currentNumber <=b) {
            System.out.print(currentNumber + " ");
            currentNumber += d;
        }
        System.out.println();
    }
}
