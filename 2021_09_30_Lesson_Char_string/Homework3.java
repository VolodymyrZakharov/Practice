package Lesson_6_Char_String;

// Change 2nd word in phrase "Enter permitted" to "restricted"
// Change all letters to capitals.
public class Homework3 {
    public static void main(String[] args) {
        changePhrase();
        changeToCapitals();
    }

    public static void changePhrase() {
        String phrase1 = "Enter permitted".substring(0, 6) + "restricted";
        System.out.println(phrase1);
    }

    public static void changeToCapitals() {
        String phrase2 = "Caution, enter restricted".toUpperCase();
        System.out.println(phrase2);
    }
}
