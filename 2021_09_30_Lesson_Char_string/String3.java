package Lesson_6_Char_String;

public class String3 {
    public static void main(String[] args) {
        String articleTitle = "london is the capital";
        articleTitle = articleTitle.substring(0,1).toUpperCase() + articleTitle.substring(1);
        System.out.println(articleTitle);
        articleTitle = articleTitle.toUpperCase();
        System.out.println(articleTitle);
        System.out.println(articleTitle.toLowerCase());
        function();
    }

    public static void function() {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
