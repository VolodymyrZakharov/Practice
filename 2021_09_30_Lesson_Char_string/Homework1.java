package Lesson_6_Char_String;

// Show interesting symbols
public class Homework1 {
    public static void main(String[] args) {
        showSymbols();
    }

    public static void showSymbols() {
        char smile = 9786;
        char phone = 9990;
        char paragraph = 167;
        char copyright = 169;
        char tradeMark = '\u2122';
        char ruble = '\u20bd';
        char dollar = '\u0024';
        char sagittarius = '\u2650';
        char chess = '\u2656';
        char hearts = '\u2660';
        System.out.println(smile);
        System.out.println(phone);
        System.out.println(paragraph);
        System.out.println(copyright);
        System.out.println(tradeMark);
        System.out.println(ruble);
        System.out.println(dollar);
        System.out.println(sagittarius);
        System.out.println(chess);
        System.out.println(hearts);
    }
}
