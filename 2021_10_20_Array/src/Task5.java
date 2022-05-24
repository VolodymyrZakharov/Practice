public class Task5 {
// вернуть сумму всех четных чисел из массива. static int function(int[] array)

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 1, 1, 1, 1};
        someOfEvenNumbers(array1);
        System.out.println(someOfEvenNumbers(array1));
    }

    static int someOfEvenNumbers(int[] array) {
        int i = 0;
        int sum = 0;
        while (i < array.length) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
            i += 1;
        }
        return sum;
    }
}
