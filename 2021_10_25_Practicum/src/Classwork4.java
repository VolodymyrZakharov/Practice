public class Classwork4 {
    // написать метод который считает средне значение всех элементов массива
    public static void main(String[] args) {
        int[] arrray = new int[]{1, 2, 3, 4, 5};
        sum(arrray);
        System.out.println(sum(arrray));
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int average = sum / array.length;
        return average;
    }
}
