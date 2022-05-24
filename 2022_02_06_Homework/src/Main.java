public class Main {

    public static void main(String[] args) {

        System.out.println(minMax(56578539));
        System.out.println(numberOfZero(105600));
        System.out.println(polindrom("qwerewq"));

    }

    public static int minMax(int a) {
        String str = Integer.toString(a);
        String[] strArray = str.split("");

        int[] array = new int[str.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        int max = array[0];
        int min = array[0];

        for (int b : array) {
            if (b > max) {
                max = b;
            }
            if (b < min) {
                min = b;
            }
        }
        return max;
    }

    public static int numberOfZero(int a) {
        String str = Integer.toString(a);
        String[] strArray = str.split("");
        int count = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("0")) {
                count++;
            }
        }
        return count;
    }

    public static boolean polindrom(String str) {
        StringBuffer buffer = new StringBuffer(str);
        StringBuffer buffer1 = buffer.reverse();
        return buffer.equals(buffer1);
    }


}
