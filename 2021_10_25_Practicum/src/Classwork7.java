public class Classwork7 {
// написать метод назодящий общие элементы двух массивов и вывести их на экран
    public static void main(String[] args) {
        int[] array1 = new int[]{4, 2, 3, 9, 5};
        int[] array2 = new int[]{1, 7, 5, 9, 5, 4};
        findMutalElements(array1, array2);
    }

    static void findMutalElements(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i]== array2[j]){
                    System.out.print(array1[i]);
                    break;
                }
            }
        }
    }
}

