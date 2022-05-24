public class Copy {
    /**
     * Делает массив таким образом, что тот становится кучей
     *
     * @param array
     */
    //Если у узла в куче индекс в массиве равен i, то индекс его детей в массиве равняется i*2 +1, i*2 + 2
    public void makeHeap(int[] array) {
        for (int i = (array.length / 2 - 1); i >= 0; i--) {
            siftDown(i, array);
        }
    }

    /**
     * Сдвигает элемент с индексом i вниз по куче таким образом, что он встает на свое место (родитель больще него, а оба дочерних элемента меньше)
     *
     * @param i
     * @param array
     */
    private void siftDown(int i, int[] array) {
        if (i * 2 + 2 < array.length) {
            int maxIndex;
            if (array[i * 2 + 1] > array[i * 2 + 2]) {
                maxIndex = i * 2 + 1;
            } else maxIndex = i * 2 + 2;

            int max = array[maxIndex];
            if (array[i] < max) {
                array[maxIndex] = array[i];
                array[i] = max;
            }
            siftDown(maxIndex, array);
        } else {
            if (i * 2 + 1 < array.length) {
                if (array[i] < array[i * 2 + 1]) {
                    int temp = array[i];
                    array[i] = array[i * 2 + 1];
                    array[i * 2 + 1] = temp;
                }
            }
        }
    }

    public void heapSort(int[] array) {
        makeHeap(array);
        int size = array.length;

        for (int i = size - 1; i >= 0; i--) {
            int x = array[0];
            array[0] = array[i];
            array[i] = x;

            siftDown3(0, i, array);
        }
    }

    private void siftDown2(int i, int size, int[] array) {
        int maxIndex = i;

        if (i * 2 + 1 < size && array[i * 2 + 1] > array[maxIndex]) {
            maxIndex = i * 2 + 1;
        }
        if (i * 2 + 2 < size && array[i * 2 + 2] > array[maxIndex]) {
            maxIndex = i * 2 + 2;
        }
        if (maxIndex != i) {
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
            siftDown2(maxIndex, size, array);
        }
    }

    private void siftDown3(int i, int size, int[] array) {
        if (i * 2 + 2 < size) {
            int maxIndex;
            if (array[i * 2 + 1] > array[i * 2 + 2]) {
                maxIndex = i * 2 + 1;
            } else maxIndex = i * 2 + 2;

            int max = array[maxIndex];
            if (array[i] < max) {
                array[maxIndex] = array[i];
                array[i] = max;
            }
            siftDown3(maxIndex, size, array);
        } else {
            if (i * 2 + 1 < size) {
                if (array[i] < array[i * 2 + 1]) {
                    int temp = array[i];
                    array[i] = array[i * 2 + 1];
                    array[i * 2 + 1] = temp;
                }
            }
        }
    }
}

