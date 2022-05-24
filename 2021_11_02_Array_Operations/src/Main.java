import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 9};

        int[] newArray = append(array, 10);
        array = append(array, 10);
        array = append(array, 15);
        array = append(array, 1);
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(array));

        array = insert(array, 2, 100);
        System.out.println(Arrays.toString(array));
    }

    /* Create & return new array which is a cope of the previous array but with the additional element number at the end, and return it*/
    static int[] append(int[] array, int number) {
        int[] res = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            res[i] = array[i];
        }
        res[array.length] = number;
        return res;
    }

    // Create & return new array which is a cope of the previous array but with the additional element inside

    static int[] insert(int[] array, int index, int number) {
        int[] res = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            res[i] = array[i];
        }
        res[index] = number;
        for (int i = index; i < array.length; i++) {
            res[i + 1] = array[i];
        }
        return res;
    }

}
