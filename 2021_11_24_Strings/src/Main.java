import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String string = "Hello world";
        String string2 = "Hello world";
        String string3 = new String("Hello world");
        String stringFromChars = new String(new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'});


        System.out.println(string == string2); // true
        System.out.println(string == string3); // false
        System.out.println(string == stringFromChars); // false
        System.out.println(string3 == stringFromChars); // false

        System.out.println(string.equals(string2)); // true массивы сравнивает поэлементно
        System.out.println(string.equals(string3)); // true
        System.out.println(string.equals(stringFromChars)); // true
        System.out.println(string3.equals(stringFromChars)); // true

        // Char
        char a = 'a';
        System.out.println(a); // 'a'
        System.out.println(a + 0); // 97
        System.out.println(string + a); // 'Hello worlda'
        System.out.println(string + (a + 0)); // Hello world97
        System.out.println(string + a + 0); // Hello worlda0
        System.out.println(0 + a + string); // 97Hello world

        // charAt() -> char
        System.out.println(string.charAt(2)); // 'l'

        // concat -> str - возвращает новую строку
        /*System.out.println(string.concat(" ").concat(string2)); // Hello world Hello world
        System.out.println(string + string2); // Hello worldHello world

        string = string2 + string2; // создался новый обьект
        System.out.println(string); // Hello worldHello world*/

        // contains() -> boolean
        System.out.println(string.contains("llo")); // true

        // startsWith(), endsWith() -> boolean
        System.out.println(string.startsWith("Hell")); // true
        System.out.println(string.endsWith("orld")); // true

        //equalsIgnoreCase() -> boolean
        String hello1 = "HeLlo";
        String hello2 = "hellO";
        System.out.println(hello1.equalsIgnoreCase(hello2)); // true
        System.out.println("HeLlo".equalsIgnoreCase("hellO")); // true, вне зависимости от регистра

        // indexOf() -> int - returns the first occurrence of pattern in the string
        System.out.println(string.indexOf("l")); // 2
        System.out.println(string.indexOf("lo")); // 3
        System.out.println(string.indexOf("llo")); // 2

        System.out.println(string.indexOf("l", 4)); // поиск начиная с 4  индкеса // 9

        // lastIndexOf() -> int - returns the last index of the pattern
        System.out.println(string.lastIndexOf("l")); // 9
        System.out.println(string.lastIndexOf("l", 8)); // 3

        // length() -> int
        System.out.println(string.length()); // 11

        // split() -> String[]
        String[] fromString = string.split("l");
        System.out.println(Arrays.toString(fromString)); // [He, , o wor, d]
        System.out.println(Arrays.toString(string.split(" "))); // [Hello, world]

        // toCharArray() -> char[]
        char[] chars = string.toCharArray(); // ['H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd']
        System.out.println(Arrays.toString(chars));

        // toLowerCase(), toUpperCase() -> String
        String upperString = string.toUpperCase();
        System.out.println(string); // Hello world
        System.out.println(upperString); // HELLO WORLD

        // subString() -> String, the second argument, which is the index of the end, is exclusive (не берется)
        String subString = string.substring(2); // "llo world"
        String subString2 = string2.substring(2, 8); //  "llo wo"
        System.out.println(subString);
        System.out.println(subString2);

        System.out.println(reverse(string));
        System.out.println(reverse2(string));

        System.out.println(palindrome("09a l L a90"));
        System.out.println(palindrome1("09a l L a90"));
        System.out.println(quantityOfThePattern("Hello world", "llo"));
        System.out.println(quantityOfThePatternIgnoreRegister("Hello worLd", 'l'));
        System.out.println(quantityOfWords("hgj ghk jhgg jkhk", 9));
    }

    static String reverse(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(chars.length - 1 - i);
        }
        return new String(chars);
    }

    // very slow case
    static String reverse2(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(str.length() - 1 - i);
        }
        return res;
    }


    // Написать метод, который принимает строку, а возвразает boolean - является ли строка палиндромом (игнорируя регистр).
    static boolean palindrome(String string) {
        char[] chars = new char[string.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = string.charAt(chars.length - 1 - i);
        }
        String newString = new String(chars);
        if (string.equalsIgnoreCase(newString)) return true;
        return false;
    }

    static boolean palindrome1(String string) {
        String[] newString = string.split("");
        for (int i = 0; i < newString.length / 2; i++) {
            if (!(newString[i].equalsIgnoreCase(newString[newString.length - 1])))
                return false;
        }
        return true;
    }

    static boolean palindrome2(String string) {
        String string2 = reverse(string);
        return string2.equalsIgnoreCase(string);
    }


    // Написать метод, который принимает строку и паттерн, и возвращает количество вхождений паттерна в строку. Пример: ("Hello world", "l") -> 3
    static int quantityOfThePattern(String string, String pattern) {
        String[] newString = string.split(String.valueOf(pattern));
        return newString.length - 1;
    }

    // // Написать метод, который принимает строку и паттерн, и возвращает количество вхождений паттерна в строку (игнорируя регистр).
    static int quantityOfThePatternIgnoreRegister(String string, char pattern) {
        int n = 0;
        String[] newString = string.split("");
        for (int i = 0; i < newString.length; i++) {
            if (newString[i].equalsIgnoreCase(String.valueOf(pattern))) {
                n++;
            }
        }
        return n;
    }

    static int quantityOfThePatternIgnoreRegister2(String string, String pattern) {
        int count = 0;
        int index = string.indexOf(pattern);
        if (index < 0) {
            return 0;
        }
        index++;
        count++;
        while (index > 0) {
            index = string.indexOf(pattern, index);
            count++;
            index++;
        }
        return count;
    }

    static int quantityOfThePatternIgnoreRegister3(String string, String pattern) {
        int count = 0;
        int index = string.indexOf(pattern);
        while (index > -1) {
            count++;
            index++;
            index = string.indexOf(pattern, index);

        }
        return count;
    }

    /* Дана строка, состоящая только из слов и пробелов, и число N.
    Вернуть новую строку максимальной длины, состоящую из начала исходной строки,
     содержащую ТОЛЬКО слова целиком, при этом длины не больше чем N.
     */
    static String quantityOfWords(String string, int n) {
        String[] array = string.split(" ");
        int length = array[0].length();
        if (length <= n) {
            for (int i = 1; i < array.length; i++) {
                if (length + (array[i].length() + 1) <= n) {
                    length += array[i].length() + 1;
                } else break;
            }
            return string.substring(0, length);
        }
        return "";
    }

    static String quantityOfWords2(String string, int n) {
        if (n >= string.length())
            return string;
        String cut = string.substring(0, n + 1);
        int lastSpaceIndex = cut.lastIndexOf(" ");
        if (lastSpaceIndex < 0)
            return "";
        return cut.substring(0, lastSpaceIndex);
    }
}
