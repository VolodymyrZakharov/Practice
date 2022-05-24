import java.util.Arrays;

public class Main <T>{

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(task5("qwerty", "rtyqwe"));
        System.out.println(task6("qwerty", "qewryt"));

        System.out.println(firstLetterToEnd(str));
        System.out.println(lastLetterToStart(str));
        System.out.println(stringToChar(str));
        System.out.println(nonRepeatString(str));
    }

    public static String firstLetterToEnd(String str) {
        return str.substring(1).concat((str.substring(0, 1)));
    }

    public static String lastLetterToStart(String str) {
        return str.substring(str.length() - 1, str.length()).concat(str.substring(0, str.length() - 1));
    }

    public static char[] stringToChar(String str) {
        char[] array = str.toCharArray();
        return array;
    }

    // Удалить все повторяющиеся элементы стринга
    public static String nonRepeatString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (result.indexOf(array[i]) == -1) {
                result += array[i];
            }
        }
        return result;
    }

    // написать метод, проверяющий являются ли одна строка анаграммой другой
    public static boolean task6(String str1, String str2) {
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        if (array1.length != array2.length) {
            return false;
        } else {
            outerFore:
            for (int i = 0; i < array1.length; i++) {
                for (int j = i; j < array1.length; j++) {
                    if (array1[i] == array2[j]) {
                        char temp = array2[i];
                        array2[i] = array2[j];
                        array2[j] = temp;
                        continue outerFore;
                    }
                }
                return false;
            }
            return true;
        }
    }

    // написать метод, проверяющий являются ли одна строка анаграммой другой
    public static boolean task8(String str1, String str2) {
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        if (array1.length != array2.length) {
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    // написать метод, проверяющий образована ли строка сдвигом букв (abc->cab)
    public static boolean task5(String str1, String str2) {
        int n = 0;
        while (n < str2.length()) {
            str2 = str2.substring(str2.length() - 1, str2.length()).concat(str2.substring(0, str2.length() - 1));
            if (str2.equals(str1)) {
                return true;
            }
            n++;
        }
        return false;
    }

    // написать метод, проверяющий образована ли строка сдвигом букв (abc->cab)
    public static boolean task7(String str1, String str2) {
        if (str1 == null) {
            throw new NullPointerException();
        }
        String str = str1.concat(str1);
        return str.contains(str2);
    }

}

