public class Task1 {
    // Заполнить массив числами от 0 до его длины минус 1 в обратном порядке. ({5,4,3,2,1,0}) . Написать функцию static void function(int[]array)

    public static void main(String[] args) {
        int[] array1 = new int[10];

        fillArrowReversely(array1);
        printArray1(array1);
    }

    public static void printArray1(int array[]) {
        for (int i = 0; i < array.length; i += 1) {
            System.out.print(array[i] + " ");
        }
    }

    public static void fillArrowReversely(int array[]) {
        for (int i = 0; i < array.length; i += 1) {
            array[i] = array.length - 1 - i;
        }
    }

}
