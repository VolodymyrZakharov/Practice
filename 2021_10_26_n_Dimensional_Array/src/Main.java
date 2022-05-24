public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};

        function1(array1);
        printArray(array1);
        function2(array1);
        printArray(array1);
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
        }
        System.out.println();
    }

    static void function1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - 1 - i;
        }
    }

    static void function2(int[] arrray) {
        for (int i = 0; i < arrray.length / 2; i++) {
            int temp = arrray[i];
            arrray[i]= arrray[arrray.length - 1 -i];
            arrray[arrray.length - 1 - i] = temp;
        }
    }
}
