import java.util.Arrays;

public class Task2 {
    /* Написать операцию (метод) static int[] delete(int[] array, int index), который принимает массив и
    возвращает ссылку на новый массив, являющийся копией старого, но без элемента по индексу index */

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int index = 4;

        int[] newArray = delete(array, index);
        System.out.println(Arrays.toString(newArray));

        int[] newArrays = deleteArrayIndex(array, index);
        System.out.println(Arrays.toString(newArrays));
    }

    static int[] delete(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[i] = array[i];
            } else {
                for (int j = index; j < newArray.length; j++) {
                    newArray[j] = array[j + 1];
                }
                break;
            }
        }
        return newArray;
    }

    static int[] deleteArrayIndex(int[] array, int index) {
        int[] newArrays = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArrays[i] = array[i];
        }
        for (int i = index+1; i < array.length; i++) {
            newArrays[i] = array[i + 1];
        }
        return newArrays;
    }
}
